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
public class Individuo {

    int Id, fenotipo;
    String genotipo;

    public Individuo(int Id, int fenotipo, String genotipo) {
        this.Id = Id;
        this.fenotipo = fenotipo;
        this.genotipo = genotipo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getFenotipo() {
        return fenotipo;
    }

    public void setFenotipo(int fenotipo) {
        this.fenotipo = fenotipo;
    }

    public String getGenotipo() {
        return genotipo;
    }

    public void setGenotipo(String genotipo) {
        this.genotipo = genotipo;
    }

}
