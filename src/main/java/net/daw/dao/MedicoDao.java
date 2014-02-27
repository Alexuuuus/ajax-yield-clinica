/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.daw.dao;

import net.daw.bean.MedicoBean;
import net.daw.bean.UsuarioBean;
import net.daw.helper.Conexion;

/**
 *
 * @author Alejandro
 */
public class MedicoDao extends GenericDaoImplementation<MedicoBean> {

    public MedicoDao(Conexion.Tipo_conexion tipoConexion, String tabla) throws Exception {
        super(tipoConexion, tabla);
    }

    public MedicoBean getFromId_usuario(UsuarioBean oUsuarioBean) throws Exception {
        MedicoBean bean = new MedicoBean();
        if (oUsuarioBean.getId() > 0) {
            try {
                oMysql.conexion(enumTipoConexion);
                String id_usuario = Integer.toString(oUsuarioBean.getId());
                Integer id_user = Integer.parseInt(oMysql.getId("medicos", "id_medico", id_usuario));
                bean.setId(id_user);
            } catch (Exception e) {
                throw new Exception("PacienteDao.getAlumno: Error: " + e.getMessage());
            } finally {
                oMysql.desconexion();
            }
        } else {
            bean.setId(0);
        }
        return bean;
    
}}