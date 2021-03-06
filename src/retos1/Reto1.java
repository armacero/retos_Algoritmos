/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Stack;
import java.util.stream.IntStream;
import static java.util.stream.StreamSupport.intStream;
import static java.util.stream.StreamSupport.intStream;

/**
 *
 * @author joseh
 */
public class Reto1 extends javax.swing.JFrame {

    int a_a, a_b, a_c, num_ind, num_participantes;
    double a_p;
    Individuo[] array_ind;
    double prob_mutacion = 0.1;
    int[] fenotipos;

    Pareja obPareja;
    ArrayList<Pareja> array_parejas = new ArrayList<>();
    ArrayList<Participante> arrayParticipante = new ArrayList<>();

    /**
     * Creates new form Reto1
     */
    public Reto1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txta = new javax.swing.JTextField();
        txtb = new javax.swing.JTextField();
        txtc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_generaAbc = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalidas = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txt_numIndividuos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selección por torneo probabilistico.");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Dominio: 0<= x <= 100");

        jLabel2.setText("a =");

        jLabel3.setText("b =");

        jLabel4.setText("c =");

        jLabel5.setText("p =");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("f(x) = ax^2 + bx + c");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_generaAbc.setText("Iniciar algoritmo");
        btn_generaAbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generaAbcActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Salidas"));

        txtSalidas.setColumns(20);
        txtSalidas.setRows(5);
        jScrollPane1.setViewportView(txtSalidas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );

        jLabel7.setText("Num. Individuos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_generaAbc)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(txt_numIndividuos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_generaAbc)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_numIndividuos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void m_obtenFenotipos() {

    }


    private void btn_generaAbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generaAbcActionPerformed
        // TODO add your handling code here:

        if (txt_numIndividuos.getText().length() <= 0) {
            System.out.println("Ingresa el numero de individuos");
        } else {
            //Limpiar las cajas de texto
            txta.setText("");
            txtb.setText("");
            txtc.setText("");
            num_ind = Integer.valueOf(txt_numIndividuos.getText());

            /*
        Generar de manera aleatoria los valores de a, b, c
        y el valor de p
             */
            //Definir el valor de p, el cual debe estar entre el rango 0.5<p<= 1
            //a_p = 0.785;
            a_p = 0.525;
            //Definir el valor de a,b y c

            int[] datos = m_generar_Datos((int) (Math.random() * (999 - 333) + 300), 3);

            a_a = datos[0];
            a_b = datos[1];
            a_c = datos[2];

            txta.setText(a_a + "");
            txtb.setText(a_b + "");
            txtc.setText(a_c + "");
            txtp.setText(a_p + "");

            for (int i = 0; i < 10; i++) {
                txtSalidas.append("\n*************************************************");
                txtSalidas.append("\nGeneración:" + i + "\n");

                txtSalidas.append("Entradas:\n");
                txtSalidas.append("*****************************");
                txtSalidas.append("\np=" + a_p + "\n");
                txtSalidas.append("a=" + a_a + "\n");
                txtSalidas.append("b=" + a_b + "\n");
                txtSalidas.append("c=" + a_c + "\n");
                txtSalidas.append("Individuos=" + num_ind + "\n");
                txtSalidas.append("*****************************");

                //Definir el fenotipo y el genotipo de cada individuo
                fenotipos = new int[num_ind];
                String[] genotipos = new String[num_ind];
                //System.out.println("FENOTIPOS");
                boolean flag = true;
                if (flag = true) {
                    for (int p = 0; p < num_ind; p++) {
                        fenotipos[p] = (int) (Math.random() * 100 + 1);
                        //System.out.println(i+1 + ":" + fenotipos[i]);
                    }
                    flag = false;
                }

                for (int o = 0; o < fenotipos.length; o++) {
                    genotipos[o] = m_obtenerGenotipo(fenotipos[o]);
                }
                //System.out.println("GENOTIPOS ADAPTADOS");
                m_adaptaGenotipos(genotipos);

                int[] array_evalua = new int[num_ind];

                //Evaluacion de Fx
                for (int n = 0; n < num_ind; n++) {
                    array_evalua[n] = (int) m_evalua(a_a, a_b, a_c, fenotipos[n]);
                }

                array_ind = new Individuo[num_ind];
                txtSalidas.append("\nIndividuo:\tFenotipo:\tGenotipo:\tEvaluación f(x)\tSeleccion");
                for (int l = 0; l < num_ind; l++) {
                    array_ind[l] = new Individuo(l, fenotipos[l], genotipos[l], array_evalua[l]);
                    txtSalidas.append("\n\n" + array_ind[l].getId() + "\t" + array_ind[l].getFenotipo() + "\t" + array_ind[l].getGenotipo() + "\t" + array_ind[l].getEvaluacion());
                }

                //Proceso de seleccion
                //Elegir que individuos van a participar en el torneo
                int k_participantes = (int) (num_ind / 2);

                Participante[] array_part = new Participante[k_participantes];
                System.out.println("    INDIVIDUOS PARTICIPANTES :");

                ArrayList<Integer> id_partici = new ArrayList<>();
                for (int h = 0; h < num_ind; h++) {

                    id_partici = m_obtenParticipantes(k_participantes);

                    for (int j = 0; j < id_partici.size(); j++) {
                        //System.out.println(id_partici.get(i));
                        array_part[j] = new Participante(array_ind[id_partici.get(j)].getId(), (int) array_ind[id_partici.get(j)].getEvaluacion(), array_ind[id_partici.get(j)].getGenotipo());
                        System.out.println(array_part[j].getId() + ":" + array_part[j].getEvaluacion() + ":" + array_part[j].getGenotipo());
                    }

                    m_Torneo(array_part);

                }

                System.out.println("Parejas Creadas");
                apilar(arrayParticipante);
                m_cruce(array_parejas);
            }

        }


    }//GEN-LAST:event_btn_generaAbcActionPerformed

    //Generar un numero aleatorio a
    /*
        IF a>p THEN q *Se elije el mas apto
        IF a<p THEN q *Se elije el menos apto
     */
    public void m_Torneo(Participante[] p_participantes) {
        double a = Math.random();
        System.out.println("a: " + a);
        //m_obtenIndividuoMasApto(p_participantes);

        if (a > a_p) {
            //Elegir al mas apto entre los participantes
            //System.out.println(m_obtenIndividuoMasApto(p_participantes));
            String[] partes = m_obtenIndividuoMasApto(p_participantes).split(",");

            int id_participante = Integer.valueOf(partes[0]);
            //int evaluacion = Integer.valueOf(partes[1]);
            String genotipo = partes[1];
            System.out.println("Mas Apto ID:" + id_participante + "Genotipo:" + genotipo);
            System.out.println("*****************************");
            arrayParticipante.add(new Participante(genotipo, id_participante));
            //obPareja.setPadre(new Participante(id_participante, genotipo));

        } else {
            //Elegir al menos apto entre los participantes

            //System.out.println(m_obtenIndividuoMenosApto(p_participantes));
            String[] partes = m_obtenIndividuoMenosApto(p_participantes).split(",");

            int id_participante = Integer.valueOf(partes[0]);
            String genotipo = partes[1];
            System.out.println("Menos Apto ID:" + id_participante + " Genotipo: " + genotipo);
            System.out.println("*****************************");
            arrayParticipante.add(new Participante(genotipo, id_participante));
            //obPareja.setMadre(new Participante(id_participante, genotipo));

        }

    }

    public String m_obtenIndividuoMasApto(Participante[] p_participantes) {
        int mas_apto = p_participantes[0].getEvaluacion();
        int id_masApto = 0;
        String genotipo = "";

        for (int i = 0; i < p_participantes.length; i++) {
//          System.out.println(nombres[i] + " " + sueldos[i]);
            if (p_participantes[i].getEvaluacion() >= mas_apto) {
                mas_apto = p_participantes[i].getEvaluacion();
                id_masApto = p_participantes[i].getId();
                genotipo = p_participantes[i].getGenotipo();

            }
        }
        String cadena = id_masApto + "," + genotipo;
        //System.out.println("CADENA MAS APTO" + cadena);
        return cadena;
    }

    public void apilar(ArrayList<Participante> arrayParticipantes) {

        Stack v_pila = new Stack();
        for (int i = 0; i < arrayParticipantes.size(); i++) {
            v_pila.push(arrayParticipantes.get(i).getId());
            v_pila.push(arrayParticipantes.get(i).getGenotipo());
        }
        while (!v_pila.empty()) {
            //System.out.println(v_pila.pop());
            Participante v_padre = new Participante(String.valueOf(v_pila.pop()), Integer.valueOf(v_pila.pop() + ""));
            Participante v_madre = new Participante(String.valueOf(v_pila.pop()), Integer.valueOf(v_pila.pop() + ""));
            obPareja = new Pareja(v_padre, v_madre);
            array_parejas.add(obPareja);
        }

    }

    public void m_cruce(ArrayList<Pareja> p_array) {

        for (int i = 0; i < p_array.size(); i++) {
            System.out.println("");
            System.out.println("Padre:" + p_array.get(i).getPadre().getId() + " " + p_array.get(i).getPadre().getGenotipo());
            System.out.println("Madre:" + p_array.get(i).getMadre().getId() + " " + p_array.get(i).getMadre().getGenotipo());

            //Cruce genotipos
            String genoPadre = p_array.get(i).getPadre().getGenotipo();
            String genoMadre = p_array.get(i).getMadre().getGenotipo();

            System.out.println("GENOTIPO PADRE:" + genoPadre);
            System.out.println("GENOTIPO MADRE:" + genoMadre);
            System.out.println("");
            //Actualizacion de nuevos genotipos

            String genoCruce1 = intercambiar(genoPadre, genoMadre);
            String genoCruce2 = intercambiar(genoPadre, genoMadre);

            p_array.get(i).getPadre().setGenotipo(genoCruce1);
            p_array.get(i).getMadre().setGenotipo(genoCruce2);

            System.out.println("Nuevos Genotipos");
            System.out.println("Padre:" + p_array.get(i).getPadre().getId() + " " + p_array.get(i).getPadre().getGenotipo());
            System.out.println("Madre:" + p_array.get(i).getMadre().getId() + " " + p_array.get(i).getMadre().getGenotipo());

            System.out.println("Genotipos Mutados");
            p_array.get(i).getPadre().setGenotipo(m_verificaMutacion(genoCruce1));
            p_array.get(i).getMadre().setGenotipo(m_verificaMutacion(genoCruce2));
            System.out.println("Padre:" + p_array.get(i).getPadre().getId() + " " + p_array.get(i).getPadre().getGenotipo());
            System.out.println("Madre:" + p_array.get(i).getMadre().getId() + " " + p_array.get(i).getMadre().getGenotipo());
            
            
           // fenotipos[i] = binario_decimal(Integer.valueOf(m_verificaMutacion(genoCruce1)));

        }

    }
    
    public int binario_decimal(int numero){
        int decimal = 0;
        int binario =numero;
        int pow = 0;
        
        while(binario!= 0){
            int ult_dig = binario % 10;
            decimal+= ult_dig * Math.pow(2, pow);
            pow++;
            binario = binario/10;
        }
        return decimal;
    }

    public String m_verificaMutacion(String p_genotipo) {
        String genotipo_mutado = "";
        char[] dig = p_genotipo.toCharArray();
        for (int i = 0; i < dig.length; i++) {
            double a = Math.random();
            if (a <= prob_mutacion) {
                if (dig[i] == '0') {
                    dig[i] = '1';
                } else {
                    dig[i] = '1';
                }
            }
        }

        genotipo_mutado = String.valueOf(dig);
        return genotipo_mutado;

    }

    //Metdodo para combinar los fenotipos
    public String intercambiar(String p_cade1, String p_caden2) {
        String cruce = "";
        if (p_cade1.length() >= 3 && p_caden2.length() >= 3) {
            cruce = p_cade1.substring(0, 4) + "" + p_caden2.substring(0, 4);

        }
        return cruce;

    }

    public String m_obtenIndividuoMenosApto(Participante[] p_participantes) {
        int menos_apto = p_participantes[0].getEvaluacion();

        int id_menosApto = 0;
        String genotipo = "";
        for (int i = 0; i < p_participantes.length; i++) {
            if (p_participantes[i].getEvaluacion() <= menos_apto) {
                menos_apto = p_participantes[i].getEvaluacion();
                id_menosApto = p_participantes[i].getId();
                genotipo = p_participantes[i].getGenotipo();
            }
        }
        String cadena = id_menosApto + "," + genotipo;
        //System.out.println("CADENA Menos APTO" + cadena);
        return cadena;
    }

    public ArrayList<Integer> m_obtenParticipantes(int p_numParticipantes) {

        Random random = new Random();

        IntStream intStream = random.ints(p_numParticipantes, 0, num_ind);

        Iterator iterator = intStream.iterator();

        ArrayList<Integer> id_participantes = new ArrayList<Integer>();

        while (iterator.hasNext()) {

            id_participantes.add((int) iterator.next());
            //array_part[i] = new Participante(array_in[(int)iterator.next()].getId(), (int) array_in[(int)iterator.next()].getEvaluacion());
            //System.out.println(array_part[(int)iterator.next()].getId() + ":" + array_part[(int)iterator.next()].getEvaluacion());

        }
        return id_participantes;
    }

    public double m_evalua(int p_a, int p_b, int p_c, int p_x) {
        double resultado = (p_a * Math.pow(p_x, 2)) + (p_b * p_x) + p_c;
        return (int) resultado;
    }

    public void m_adaptaGenotipos(String[] p_genotipos) {
        int longitud = genotipoMasLargo(p_genotipos);
        for (int i = 0; i < p_genotipos.length; i++) {
            while (p_genotipos[i].length() < longitud) {
                p_genotipos[i] = "0" + p_genotipos[i];

            }
            //System.out.println(p_genotipos[i]);
        }

    }

    public static String m_obtenerGenotipo(int numero) {
        String binario = Integer.toBinaryString(numero);

        return binario;
    }

    public static int genotipoMasLargo(String[] cadenas) {
        String mayor = cadenas[0];
        for (int i = 1; i < cadenas.length; i++) {
            if (cadenas[i].length() > mayor.length()) {
                mayor = cadenas[i];
            }
        }
        return mayor.length();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reto1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reto1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reto1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reto1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reto1().setVisible(true);
            }
        });
    }

    public void m_aleatorios(int p_semilla, int p_cant) {

    }

    public int[] m_generar_Datos(int semilla, int cantidad) {
        int[] valores = new int[cantidad];
        String snumero2, snumero3, valor;
        int tam1, tam2, i, primerc;
        long numero1, numero2;
        valor = "" + semilla;
        tam1 = valor.length();
        numero1 = semilla;
        for (i = 0; i < cantidad; i++) {
            numero2 = (long) Math.pow(numero1, 2);
            snumero2 = Long.toString(numero2);
            tam2 = snumero2.length();
            primerc = (tam2 - tam1) / 2;
            snumero3 = snumero2.substring(primerc, primerc + tam1);
            valores[i] = Integer.parseInt(snumero3);
            numero1 = Integer.parseInt(snumero3);
        }

        return valores;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generaAbc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtSalidas;
    private javax.swing.JTextField txt_numIndividuos;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    private javax.swing.JTextField txtc;
    private javax.swing.JTextField txtp;
    // End of variables declaration//GEN-END:variables
}
