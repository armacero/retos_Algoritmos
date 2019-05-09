/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Dictionary;

/**
 *
 * @author obito
 */
public class numerosAleatorios {

    public int[][] matriz_Distancias;
    public int[] Distancia;
    public Double[] eFuncion;
    
    
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
    
    public int[][] generar_Distancias(int semilla ,int cantidad)
    {
        
        
        String snumero2, snumero3, valor;
        int tam1, tam2, i, primerc;
        long numero1, numero2;
        

        valor = "" + semilla;
        tam1 = valor.length();
        System.out.println("Cantidad de digitos:  " + tam1);
        numero1 = semilla;
        matriz_Distancias = new int[cantidad][cantidad];
        for (i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                if (i == j) {
                   
                    matriz_Distancias[i][j] = 0;
                } else {
                    numero2 = (long) Math.pow(numero1, 2);
                    snumero2 = Long.toString(numero2);
                    tam2 = snumero2.length();
                    primerc = (tam2 - tam1) / 2;
                    snumero3 = snumero2.substring(primerc, primerc + tam1);
                    //System.out.println(i + "- " + snumero3);
                    matriz_Distancias[i][j] = Integer.parseInt(snumero3);
                    numero1 = Integer.parseInt(snumero3);
                    //(formateador.format (valores));
                }
                
            }
            
        }
        imprimir_matriz(matriz_Distancias,cantidad);
        return matriz_Distancias;
    }
    
    
    
    public void imprimir_matriz(int[][] matriz, int cantidad)
    {
        String imprime="";
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                imprime+="-"+matriz[i][j];
            }
            imprime+="\n";
        }
        System.out.println(imprime);
    }
    
    public int sumatoria_Distancias(ArrayList<Integer> ruta)
    {
        int tamaño= ruta.size();
        int distancia = 0;
        for (int i = 0; i < tamaño; i++) {
             if (i==tamaño-2) {
                 i=tamaño;
                break;
            }
             if (i==tamaño) {
                
            }
            else
             {
                 int ciudad =ruta.get(i);
            int ciudadSiguiente = ruta.get(i+1);
            
            distancia= distancia+ matriz_Distancias[ciudad][ciudadSiguiente];
             }
            
            
           
        }
        return distancia;
    }
    
    public void funcion_aptitud(ArrayList<ArrayList<Integer>> combinaciones)
    {
        
        
        
        int tamaño= combinaciones.size();
        Distancia = new int[tamaño];
        eFuncion = new Double[tamaño];
        for (int i = 0; i < combinaciones.size(); i++) {

            Distancia[i] = sumatoria_Distancias(combinaciones.get(i));
            Double DistanciaC;
            DistanciaC = Distancia[i] * 1.0;
            eFuncion[i] = 1 / DistanciaC;

            System.out.println("Funcion: " + eFuncion[i] + "\n"
                    + "Distancia: " + Distancia[i]);

        }
        
    }
    
    
}
