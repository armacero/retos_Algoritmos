
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
    JTextArea messages;
    public static ArrayList<ArrayList<Integer>> Combinacion;
     
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
                int num = Integer.parseInt(JOptionPane.showInputDialog(cp, "Ingresa número de ciudades", JOptionPane.INPUT_VALUE_PROPERTY));
                for (int i=1;i<=num;i++){
                    numeros.add(i);
                }
            }
        });
        cuidades.add(menuItem);
        
        return menuBar;
    }
    
    public void generarComb(){
        String r;
        ArrayList<Integer> dentroLinea = new ArrayList<Integer>();
        for (int i = 0; i < numeros.size(); i++) {
           
            for (int j = 0; j < numeros.size(); j++) {
              
                for (int k = 0; k < numeros.size(); k++) {
                   
                    for (int l = 0; l < numeros.size(); l++) {
                        dentroLinea.add(numeros.get(i));
                        dentroLinea.add(numeros.get(j));
                        dentroLinea.add(numeros.get(k));
                        dentroLinea.add(numeros.get(l));
                        r=""+numeros.get(i)+numeros.get(j)+numeros.get(k)+numeros.get(l);
                        Combinacion.add(dentroLinea);
                        System.out.println(r);
                        dentroLinea = new ArrayList<Integer>();
                    }
                }
            }
        }
    }
}