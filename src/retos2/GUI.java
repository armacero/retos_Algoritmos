
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos2;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Component.LEFT_ALIGNMENT;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Cipactly Torres
 */
public class GUI extends JFrame{
    int n,r;
    JTextArea messages;
    ArrayList<ArrayList<Integer>> returnMe = new ArrayList<ArrayList<Integer>>();
     ArrayList<Integer> dentroLinea;
    public int num;
    public Double[] numeros_Aleatorios;
    public int[][] matriz_Distancias;
    ArrayList<Integer> numeros = new ArrayList();
    public GUI(){
        super("Agente Viajero");
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container cp = getContentPane();
        cp.add(Menu(cp), BorderLayout.NORTH);
        
        messages = new JTextArea("Mensajes");
        messages.setEnabled(false);
        messages.setBackground(Color.black);
        JScrollPane messagesScrollPane = new JScrollPane(messages);
        messagesScrollPane.setMinimumSize(new Dimension(100, 200));
        messagesScrollPane.setPreferredSize(new Dimension(100, 200));
        messagesScrollPane.setAlignmentX(LEFT_ALIGNMENT);
        cp.add(messagesScrollPane, BorderLayout.SOUTH);

        setVisible(true);
    }
    
    JMenuBar Menu(Container cp){
        JMenuBar menuBar;
        JMenu cuidades, mutacion;
        JMenuItem menuItem;
        menuBar = new JMenuBar();
        cuidades = new JMenu("Ciudades");
        mutacion = new JMenu("Mutacion");
        menuBar.add(cuidades);
        menuBar.add(mutacion);
        
        menuItem = new JMenuItem("Agregar Cuidad");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                num= Integer.parseInt(JOptionPane.showInputDialog(cp, "Ingresa número de ciudades", JOptionPane.INPUT_VALUE_PROPERTY));
                for (int i=1;i<=num;i++){
                    numeros.add(i);
                }
                 generarComb();
                 numerosAleatorios numerosA= new numerosAleatorios();
                 numeros_Aleatorios= numerosA.generador((int) (Math.random()*(999-333)+300),num);
                 matriz_Distancias= numerosA.generar_Distancias((int) (Math.random()*(999-333)+300),num);
                 numerosA.funcion_aptitud(returnMe);
            }
        });
        cuidades.add(menuItem);
        
        return menuBar;
    }
    
   /* public void generarComb(){
        String r;
        
         dentroLinea = new ArrayList<Integer>();
        for (int i = 0; i < numeros.size(); i++) {
           
            for (int j = 0; j < numeros.size(); j++) {
              
                for (int k = 0; k < numeros.size(); k++) {
                   
                    for (int l = 0; l < numeros.size(); l++) {
                        dentroLinea.add(numeros.get(i));
                        dentroLinea.add(numeros.get(j));
                        dentroLinea.add(numeros.get(k));
                        dentroLinea.add(numeros.get(l));
                        //r=""+numeros.get(i)+numeros.get(j)+numeros.get(k)+numeros.get(l);
                        Combinacion.add(dentroLinea);
                        //System.out.println(r);
                        dentroLinea = new ArrayList<Integer>();
                    }
                }
            }
        }
    }
    */
    public int factorial(int n){
        if(n!=0)
        {
            n=n*factorial(n-1);   
        }
        else{
            return 1;
        }
        //System.out.println("factorial "+n);
        return n;
    }
    
    public void generarComb(){
        //int numComb = factorial(n)/(factorial(n)*factorial(n-r));
        int numComb = factorial(n)/factorial(n-r);
        //(numeros, "", n, r);
        System.out.println(returnMe);
    }
    
    /**
     *
     * @param lista
     * @return
     */
    public ArrayList<ArrayList<Integer>> listaPermutaciones(ArrayList<Integer> lista){
        if (numeros.isEmpty()) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
            result.add(new ArrayList<Integer>());
            return result;
        }
        
        Integer firstElement = lista.remove(0);
        
        ArrayList<ArrayList<Integer>> recursiveReturn = listaPermutaciones(lista);
        for (ArrayList<Integer> li : recursiveReturn) {

            for (int index = 0; index <= li.size(); index++) {
                ArrayList<Integer> temp = new ArrayList<Integer>(li);
                temp.add(index,numeros.indexOf(index));
                returnMe.add(temp);
            }

        }
        return returnMe;
    }
}