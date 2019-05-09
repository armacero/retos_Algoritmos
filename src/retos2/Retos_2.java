/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos2;

/**
 *
 * @author obito
 */
public class Retos_2 {
    public static int cantidadNumeros=0;
    public static void main(String[] args) {
        cantidadNumeros = 4;
        GUI gui= new GUI();
     
        numerosAleatorios num= new numerosAleatorios();
        num.generador((int) (Math.random()*(999-333)+300),cantidadNumeros);
        num.generar_Distancias((int) (Math.random()*(999-333)+300),cantidadNumeros);
                
    }
}
