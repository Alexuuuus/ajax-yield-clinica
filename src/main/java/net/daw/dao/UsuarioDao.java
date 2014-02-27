/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.dao;

import net.daw.bean.MedicoBean;
import net.daw.bean.PacienteBean;
import net.daw.bean.UsuarioBean;
import net.daw.helper.Conexion;
import net.daw.helper.Enum;

/**
 *
 * @author Alejandro
 */
public class UsuarioDao extends GenericDaoImplementation<UsuarioBean> {

    public UsuarioDao(Conexion.Tipo_conexion tipoConexion) throws Exception {
        super(tipoConexion, "usuario");
    }

    public UsuarioBean getFromLogin(UsuarioBean oUsuario) throws Exception {
        try {
            oMysql.conexion(enumTipoConexion);
            String strId = oMysql.getId("usuario", "login", oUsuario.getLogin());
            if (strId == null) {
                oUsuario.setId(0);
            } else {
                oUsuario.setId(Integer.parseInt(strId));
                String pass = oUsuario.getPassword();
                oUsuario.setPassword(oMysql.getOne("usuario", "password", oUsuario.getId()));
                if (!pass.equals(oUsuario.getPassword())) {
                    oUsuario.setId(0);
                }
            }
            oMysql.desconexion();
            return oUsuario;
        } catch (Exception e) {
            throw new Exception("UsuarioDao.getFromLogin: Error: " + e.getMessage());
        }
    }

    public UsuarioBean type(UsuarioBean oUsuarioBean) throws Exception {

        try {
            PacienteDao dao = new PacienteDao(enumTipoConexion, "pacientes");
            PacienteBean bean = dao.getFromId_usuario(oUsuarioBean);
            oUsuarioBean.setTipoUsuario(Enum.TipoUsuario.Alumno);
        } catch (Exception e1) {
            try {
                MedicoDao dao = new MedicoDao(enumTipoConexion, "medicos");
                MedicoBean bean = dao.getFromId_usuario(oUsuarioBean);
                oUsuarioBean.setTipoUsuario(Enum.TipoUsuario.Alumno);
            } catch (Exception e3) {
                throw new Exception("UsuarioDao.type: Error: " + e3.getMessage());
            }
        } finally {
            oMysql.desconexion();
        }
        return oUsuarioBean;
    }

    @Override
    public UsuarioBean get(UsuarioBean oUsuarioBean) throws Exception {
        if (oUsuarioBean.getId() > 0) {
            try {
                oMysql.conexion(enumTipoConexion);
                if (!oMysql.existsOne("usuario", oUsuarioBean.getId())) {
                    oUsuarioBean.setId(0);
                } else {
                    oUsuarioBean.setLogin(oMysql.getOne("usuario", "login", oUsuarioBean.getId()));
                    oUsuarioBean.setPassword(oMysql.getOne("usuario", "password", oUsuarioBean.getId()));
                }
            } catch (Exception e) {
                throw new Exception("UsuarioDao.getUsuario: Error: " + e.getMessage());
            } finally {
                oMysql.desconexion();
            }
        } else {
            oUsuarioBean.setId(0);
        }
        return oUsuarioBean;
    }

}
