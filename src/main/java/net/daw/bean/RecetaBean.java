/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.daw.bean;

import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class RecetaBean {
    private Integer id = 0;
    private ConsultaBean consulta = null;
    private Date inicioTratamiento = new Date();
    private Integer duracion = 0;
    private String descripcion = "";
    private MedicamentoBean medicamento = null;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the consulta
     */
    public ConsultaBean getConsulta() {
        return consulta;
    }

    /**
     * @param consulta the consulta to set
     */
    public void setConsulta(ConsultaBean consulta) {
        this.consulta = consulta;
    }

    /**
     * @return the inicioTratamiento
     */
    public Date getInicioTratamiento() {
        return inicioTratamiento;
    }

    /**
     * @param inicioTratamiento the inicioTratamiento to set
     */
    public void setInicioTratamiento(Date inicioTratamiento) {
        this.inicioTratamiento = inicioTratamiento;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the medicamento
     */
    public MedicamentoBean getMedicamento() {
        return medicamento;
    }

    /**
     * @param medicamento the medicamento to set
     */
    public void setMedicamento(MedicamentoBean medicamento) {
        this.medicamento = medicamento;
    }
}
