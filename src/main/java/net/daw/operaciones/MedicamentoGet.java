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
import net.daw.bean.MedicamentoBean;
import net.daw.dao.MedicamentoDao;
import net.daw.helper.Conexion;
/**
 *
 * @author VICENTE
 */
public class MedicamentoGet implements GenericOperation{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String data;         
        try {            
            if (request.getParameter("id") == null) {
                data = "{\"error\":\"id is mandatory\"}";
            } else {
                MedicamentoDao dao = new MedicamentoDao(Conexion.getConection(),"medicamento");
                MedicamentoBean bean = new MedicamentoBean();
                bean.setId(Integer.parseInt(request.getParameter("id")));
                dao.get(bean);                                
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.setDateFormat("dd/MM/yyyy");
                Gson gson = gsonBuilder.create();
                data = gson.toJson(bean);     
            }
            return data;
        } catch (Exception e) {
            throw new ServletException("MedicamentoGetJson: View Error: " + e.getMessage());
        }
    }
}
