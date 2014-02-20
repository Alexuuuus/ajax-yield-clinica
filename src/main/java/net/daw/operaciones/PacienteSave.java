/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.operaciones;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.daw.helper.Conexion;
import net.daw.bean.PacienteBean;
import net.daw.dao.PacienteDao;
import net.daw.helper.EncodingUtil;

/**
 *
 * @author Alejandro
 */
public class PacienteSave implements GenericOperation {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            PacienteDao dao = new PacienteDao(Conexion.getConection(),"pacientes");
            PacienteBean bean = new PacienteBean();
            Gson gson=  new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
            String jason = request.getParameter("json");
            jason = EncodingUtil.decodeURIComponent(jason);
            bean = gson.fromJson(jason, bean.getClass());
            Map<String, String> data = new HashMap<>();
            if (bean != null) {
                dao.set(bean);
                data.put("status", "200");
                data.put("message", Integer.toString(bean.getId()));
            } else {
                data.put("status", "error");
                data.put("message", "error");
            }
            String resultado = gson.toJson(data);
            return resultado;
        } catch (Exception e) {
            throw new ServletException("PacienteSaveJson: View Error: " + e.getMessage());
        }
    }
}
