/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author obito
 */
public class numerosAleatorios {

    public Double[] generador(int semilla, int cantidad) {
      
        Double[] numerosAleatorios = new Double[cantidad];
        String snumero2, snumero3, valor;
        int tam1, tam2, i, primerc;
        long numero1, numero2;
        Double resul;

        valor = "" + semilla;
        tam1 = valor.length();
        System.out.println("Cantidad de digitos:  " + tam1);
        numero1 = semilla;
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat formateador = new DecimalFormat("#.###", simbolos);
        for (i = 1; i <= cantidad; i++) {
            numero2 = (long) Math.pow(numero1, 2);
            snumero2 = Long.toString(numero2);
            tam2 = snumero2.length();
            primerc = (tam2 - tam1) / 2;
            snumero3 = snumero2.substring(primerc, primerc + tam1);
            valor = "." + snumero3;
            resul = Double.parseDouble(valor);
            System.out.println(i + "- " + resul);
            numerosAleatorios[i-1] = resul;
            numero1 = Integer.parseInt(snumero3);
            //(formateador.format (valores));
        }
        return numerosAleatorios;
    }
}