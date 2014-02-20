/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.dao;

import net.daw.bean.PacienteBean;
import net.daw.bean.UsuarioBean;
import net.daw.helper.Conexion;

/**
 *
 * @author Alejandro
 */
public class PacienteDao extends GenericDaoImplementation<PacienteBean> {

    public PacienteDao(Conexion.Tipo_conexion tipoConexion, String tabla) throws Exception {
        super(tipoConexion, tabla);
    }

    public PacienteBean getFromId_usuario(UsuarioBean oUsuarioBean) throws Exception {
        PacienteBean bean = new PacienteBean();
        if (oUsuarioBean.getId() > 0) {
            try {
                oMysql.conexion(enumTipoConexion);
                String id_usuario = Integer.toString(oUsuarioBean.getId());
                Integer id_user = Integer.parseInt(oMysql.getId("pacientes", "id_paciente", id_usuario));
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
