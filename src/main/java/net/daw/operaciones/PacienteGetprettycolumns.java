/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.operaciones;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alejandro
 */
public class PacienteGetprettycolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            String data = "{\"data\": [\"id\", \"nombre\", \"apellidos\", \"dni\", \"telefono\",\"Validado\"]}";
            return data;
        } catch (Exception e) {
            throw new ServletException("PacienteGetpagesJson: View Error: " + e.getMessage());
        }
    }
}