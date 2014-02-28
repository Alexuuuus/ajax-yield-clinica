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
 * @author VICENTE
 */
public class MedicamentoGetprettycolumns implements GenericOperation{
     @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            String data = "{\"data\": [\"id\", \"codigo\", \"nombre\", \"cantidad\", \"id_receta\"]}";
            return data;
        } catch (Exception e) {
            throw new ServletException("MedicamentoGetpagesJson: View Error: " + e.getMessage());
        }
    }
}
