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
public class RecetaGetprettycolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            String data = "{\"data\": [\"id\", \"inicio_tratamiento\", \"duracion\", \"descripcion\", \"id_consulta\",\"id_medicamento\"]}";
            return data;
        } catch (Exception e) {
            throw new ServletException("RecetaGetpagesJson: View Error: " + e.getMessage());
        }
    }
}
