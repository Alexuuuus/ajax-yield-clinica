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
public class ServicioGetprettycolums implements GenericOperation {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            String data = "{\"data\": [\"id\", \"descripcion\",\"id_medico\"]}";
            return data;
        } catch (Exception e) {
            throw new ServletException("RServicioGetpagesJson: View Error: " + e.getMessage());
        }
    }
    
}
