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
import net.daw.bean.HistorialBean;
import net.daw.dao.HistorialDao;
import net.daw.helper.Conexion;

/**
 *
 * @author Alejandro
 */
public class HistorialGet implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String data;         
        try {            
            if (request.getParameter("id") == null) {
                data = "{\"error\":\"id is mandatory\"}";
            } else {
                HistorialDao dao = new HistorialDao(Conexion.getConection(),"historial");
                HistorialBean bean = new HistorialBean();
                bean.setId(Integer.parseInt(request.getParameter("id")));
                dao.get(bean);                                
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.setDateFormat("dd/MM/yyyy");
                Gson gson = gsonBuilder.create();
                data = gson.toJson(bean);     
            }
            return data;
        } catch (Exception e) {
            throw new ServletException("HistorialGetJson: View Error: " + e.getMessage());
        }
    }
}

