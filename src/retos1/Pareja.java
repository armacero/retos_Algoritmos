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
public class Pareja {

    Participante padre, madre;

    public Pareja(Participante padre, Participante madre) {
        this.padre = padre;
        this.madre = madre;
    }

    public Pareja() {
    }
    
    
    
    
    

    public Participante getPadre() {
        return padre;
    }

    public void setPadre(Participante padre) {
        this.padre = padre;
    }

    public Participante getMadre() {
        return madre;
    }

    public void setMadre(Participante madre) {
        this.madre = madre;
    }

}
