/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package s10p06cepaleta;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author 177232
 */
//public class paletilla extends JFrame {
    public class paletilla extends JFrame implements ActionListener, KeyListener{
    int x1 = 120;
    int y1 = 110;
    
    private char[] letras = "abcdefghijklmnñopqrstuvwxyz".toCharArray(); //es un arreglo que guarda en cada uno de sus espacios  cada letra de la cadena
    private Random rand = new Random();
    private ArrayList<Point> posiciones = new ArrayList<>();                 //Point representa un punto (x, y) en un plano cartesiano, donde x e y son valores enteros.
    private ArrayList<Object> letrasA = new ArrayList<>();
    private ArrayList<LetraJuego> posi = new ArrayList<>();
    public LetraJuego pos[] = new LetraJuego[100];
    Palabras pal;
    int vidas;
    int winner =0;
    ImageIcon imagen;
    
    public paletilla(int nivel) {
        
        initComponents();
        this.setVisible(true);
        addKeyListener(this);
        this.pack();
        //prueba.setBorder(BorderFactory.createLineBorder(Color.black));
        imagen = new ImageIcon("img\\stick.png");
        // Establece la imagen en el JLabel
        prueba.setIcon(imagen);
        
        mostrarLetrasAleatorias();
        pal = new Palabras(nivel); 
        vidas = 8; 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        prueba = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbAhorcado = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l0 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1105, 661));

        prueba.setMaximumSize(new java.awt.Dimension(20, 20));
        prueba.setMinimumSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(437, Short.MAX_VALUE)
                .addComponent(prueba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(prueba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("---"));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lbAhorcado.setBackground(new java.awt.Color(255, 255, 255));

        l1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        l0.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        l0.setToolTipText("");

        l3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        l3.setToolTipText("");

        l2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        l2.setToolTipText("");

        l4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        l4.setToolTipText("");

        l5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        l5.setToolTipText("");

        l6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        l6.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(l0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(l0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarLetrasAleatorias() {
        
        for (int i = 0; i < 70; i++) {
            Point posicion = generarPosicionAleatoria();
            LetraJuego letraGen = new LetraJuego(posicion); 
            
            letraGen.letraLabel.addMouseListener(new MouseAdapter() { 
                @Override
                public void mouseClicked(MouseEvent e) {
                    PointerInfo p1 = MouseInfo.getPointerInfo();
                    Point point1 = p1.getLocation();
                    System.out.println("Letra seleccionada: " + letraGen.letra);
                    
                    adivinaLetra(letraGen.letra,pal.nivel);
                }
            });
            
            jPanel1.add(letraGen.letraLabel);
            posi.add(letraGen);
            pos[i] = letraGen;
        }
    }
    
    private Point generarPosicionAleatoria() {
        int x = rand.nextInt(jPanel1.getWidth() - 20); //  X aleatoria
        int y = rand.nextInt(jPanel1.getHeight() - 20); // Y aleatoria
        return new Point(x, y);
    }
    
    public void adivinaLetra(String letraS, int nivel){
        bordes(nivel);                                         // establecemos cuales son los labels que se harán visibles
        String letra = letraS;                                  // la letra seleccionada se convierte a char
        char charLetra = letra.charAt(0);
        int posicion = pal.verificarLetra(charLetra);       //se retorna la posicion de la letra por lo que se reutiliza 
            if(posicion != 100){                              //cuando regresa el valor de 100 significa que la letra no se encuentra en la palabra
                switch(nivel){
                    case 1 -> {
                        switch(posicion){
                            case 0 -> {l1.setText(" "+ letra.toUpperCase());}
                            case 1 -> {l2.setText(" "+letra.toUpperCase());}
                            case 2 -> {l3.setText(" "+letra.toUpperCase());}
                            case 3 -> {l4.setText(" "+letra.toUpperCase());}
                            case 4 -> {l5.setText(" "+letra.toUpperCase());}
                        }
                        //cuando todas las casillas ya tienen letra significa que la palabra esta completa
                        //por lo que el usuario gana
                        if(!"".equals(l1.getText()) && !"".equals(l2.getText()) && !"".equals(l3.getText()) 
                                && !"".equals(l4.getText()) && !"".equals(l5.getText())){
                            new Winner().setVisible(true);
                        }
                    }
                    case 2 -> {
                        switch(posicion){
                            case 0 -> {l0.setText(" "+letra.toUpperCase());}
                            case 1 -> {l1.setText(" "+letra.toUpperCase());}
                            case 2 -> {l2.setText(" "+letra.toUpperCase());}
                            case 3 -> {l3.setText(" "+letra.toUpperCase());}
                            case 4 -> {l4.setText(" "+letra.toUpperCase());}
                            case 5 -> {l5.setText(" "+letra.toUpperCase());}
                        }
                        if(!"".equals(l1.getText()) && !"".equals(l2.getText()) && !"".equals(l3.getText()) 
                                && !"".equals(l4.getText()) && !"".equals(l5.getText()) && !"".equals(l0.getText())){
                            new Winner().setVisible(true);
                        }
                    }
                    case 3 -> {
                        switch(posicion){
                            case 0 -> {l0.setText(" "+letra.toUpperCase());}
                            case 1 -> {l1.setText(" "+letra.toUpperCase());}
                            case 2 -> {l2.setText(" "+letra.toUpperCase());}
                            case 3 -> {l3.setText(" "+letra.toUpperCase());}
                            case 4 -> {l4.setText(" "+letra.toUpperCase());}
                            case 5 -> {l5.setText(" "+letra.toUpperCase());}
                            case 6 -> {l6.setText(" "+letra.toUpperCase());}
                        }
                        if(!"".equals(l1.getText()) && !"".equals(l2.getText()) && !"".equals(l3.getText()) 
                                && !"".equals(l4.getText()) && !"".equals(l5.getText()) && !"".equals(l0.getText())
                                && !"".equals(l6.getText())){
                            new Winner().setVisible(true);
                        }
                    }
                }
                
            }else{
                vidas--;
                //hacer el cambio de imagenes del label
                //las imaegnes estan numeradas desde que tienes la mayor cantidad de vidas 
                //la primer imagen que deberia aparecer es la numero 9
                //la ultima imagen que deberia aparecer es la 0
                if(vidas <= 0){
                    new Loser().setVisible(true);
                }
            }
    }
    
    public void bordes(int nivel){
        int grosorBorde = 3; // Grosor del borde en píxeles
        Color colorBorde = Color.yellow; // Color del borde
        javax.swing.border.Border bordePersonalizado = BorderFactory.createLineBorder(colorBorde, grosorBorde);

        // Aplicar el borde personalizado al JLabel
        l0.setBorder(bordePersonalizado);
        l1.setBorder(bordePersonalizado);
        l2.setBorder(bordePersonalizado);
        l3.setBorder(bordePersonalizado);
        l4.setBorder(bordePersonalizado);
        l5.setBorder(bordePersonalizado);
        l6.setBorder(bordePersonalizado);
        switch(nivel){
            case 1 -> {
                l0.setBorder(null);
                l6.setBorder(null);
            }
            case 2 -> {
                l6.setBorder(null);
            }
            case 3 -> {}
        }
    }
    
    public void keyPressed(KeyEvent e)
	{
            if(x1 >= 680){
                x1 = 680;
            }else if(x1 <= 1){
                x1 = 1;
            }
            if(y1 >= 670){
                y1 = 670;
            }else if(y1 <= -20){
                y1 = -20;
            }
            
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    x1+=3;
                    prueba.setBounds(x1, y1, 40, 45);      
                    prueba.setIcon(imagen);
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    x1-=3;
                    prueba.setBounds(x1, y1,  40, 45);
                    prueba.setIcon(imagen);
                    
                }
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    y1-=3;
                    prueba.setBounds(x1, y1,  40, 45);
                    prueba.setIcon(imagen);
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    y1+=3;
                    prueba.setBounds(x1, y1,  40, 45);
                    prueba.setIcon(imagen);
                }    
	}
    public void actionPerformed(ActionEvent event){
        
    }
    
    public void  keyReleased(KeyEvent e){
        
    }
    public void  keyTyped(KeyEvent e){
        
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l0;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel lbAhorcado;
    private javax.swing.JLabel prueba;
    // End of variables declaration//GEN-END:variables
}
