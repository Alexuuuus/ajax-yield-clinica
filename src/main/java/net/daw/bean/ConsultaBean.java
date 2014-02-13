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
public class ConsultaBean {
    private int id;
    private MedicoBean medico;
    private PacienteBean paciente;
    private Date diaConsulta;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the medico
     */
    public MedicoBean getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(MedicoBean medico) {
        this.medico = medico;
    }

    /**
     * @return the paciente
     */
    public PacienteBean getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(PacienteBean paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the diaConsulta
     */
    public Date getDiaConsulta() {
        return diaConsulta;
    }

    /**
     * @param diaConsulta the diaConsulta to set
     */
    public void setDiaConsulta(Date diaConsulta) {
        this.diaConsulta = diaConsulta;
    }
}
