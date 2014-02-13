/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.daw.dao;

import net.daw.bean.HistorialBean;
import net.daw.helper.Conexion;

/**
 *
 * @author Alejandro
 */
public class HistorialDao extends GenericDaoImplementation<HistorialBean>{

    public HistorialDao(Conexion.Tipo_conexion tipoConexion, String tabla) throws Exception {
        super(tipoConexion, tabla);
    }
    
}
