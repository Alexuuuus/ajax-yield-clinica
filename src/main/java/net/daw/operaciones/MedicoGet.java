/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.operaciones;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.daw.bean.MedicoBean;
import net.daw.dao.MedicoDao;
import net.daw.helper.Conexion;

/**
 *
 * @author VICENTE
 */
public class MedicoGet implements GenericOperation {
    

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String data;         
        try {            
            if (request.getParameter("id") == null) {
                data = "{\"error\":\"id is mandatory\"}";
            } else {
                MedicoDao dao = new MedicoDao(Conexion.getConection(),"historiales");
                MedicoBean bean = new MedicoBean();
                bean.setId(Integer.parseInt(request.getParameter("id")));
                dao.get(bean);                                
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.setDateFormat("dd/MM/yyyy");
                Gson gson = gsonBuilder.create();
                data = gson.toJson(bean);     
            }
            return data;
        } catch (Exception e) {
            throw new ServletException("MedicoGetJson: View Error: " + e.getMessage());
        }
    }
}

    

