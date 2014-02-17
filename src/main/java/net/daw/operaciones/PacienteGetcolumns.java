/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.operaciones;

import com.google.gson.Gson;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.daw.dao.PacienteDao;
import net.daw.helper.Conexion;

/**
 *
 * @author Alejandro
 */
public class PacienteGetcolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<String> alColumns = null;
        try {
            PacienteDao dao = new PacienteDao(Conexion.getConection(),"paciente");
            alColumns = dao.getColumnsNames();
            String data = new Gson().toJson(alColumns);
            data = "{\"data\":" + data + "}";
            return data;
        } catch (Exception e) {
            throw new ServletException("PacienteGetcolumnsJson: View Error: " + e.getMessage());
        }
    }

}