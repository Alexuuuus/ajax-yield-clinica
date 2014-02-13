/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.daw.operaciones;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.daw.bean.PacienteBean;
import net.daw.dao.PacienteDao;
import net.daw.helper.Conexion;

/**
 *
 * @author Alejandro
 */
public class PacienteGet implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String data;         
        try {            
            if (request.getParameter("id") == null) {
                data = "{\"error\":\"id is mandatory\"}";
            } else {
                PacienteDao dao = new PacienteDao(Conexion.getConection(),"pacientes");
                PacienteBean bean = new PacienteBean();
                bean.setId(Integer.parseInt(request.getParameter("id")));
                dao.get(bean);                                
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.setDateFormat("dd/MM/yyyy");
                Gson gson = gsonBuilder.create();
                data = gson.toJson(bean);     
            }
            return data;
        } catch (Exception e) {
            throw new ServletException("PacienteGetJson: View Error: " + e.getMessage());
        }
    }
}
