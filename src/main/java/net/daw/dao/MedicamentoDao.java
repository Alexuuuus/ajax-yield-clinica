/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.daw.dao;

import net.daw.bean.MedicamentoBean;
import net.daw.helper.Conexion;

/**
 *
 * @author Alejandro
 */
public class MedicamentoDao extends GenericDaoImplementation<MedicamentoBean>{

    public MedicamentoDao(Conexion.Tipo_conexion tipoConexion, String tabla) throws Exception {
        super(tipoConexion, tabla);
    }
    
}
