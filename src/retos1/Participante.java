/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos1;

/**
 *
 * @author joseh
 */
public class Participante {

    int id, evaluacion;
    String genotipo;

    public Participante(int id, int evaluacion, String genotipo) {
        this.id = id;
        this.evaluacion = evaluacion;
        this.genotipo = genotipo;
    }

    public Participante( String genotipo,int id) {
        this.id = id;
        this.genotipo = genotipo;
    }
    
    
    

    
    public String getGenotipo() {
        return genotipo;
    }

    public void setGenotipo(String genotipo) {
        this.genotipo = genotipo;
    }

    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(int evaluacion) {
        this.evaluacion = evaluacion;
    }

    public Participante() {
    }

}
