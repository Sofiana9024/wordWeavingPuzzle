/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s10p06cepaleta;

import java.awt.Font;
import java.awt.Point;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author LenovoLap
 */
public class LetraJuego {
    
    private char[] letras = "aaaaaaaaabbbbccccddddeeeeeeffffgggghhhhiiiiiijjjkkklllmmmnnnñññoooooopppqqqqrrrrssssttttuuuuuuvvwwxxyyzz".toCharArray(); 
    private char[] vocales = "aaaaaeeeeeiiiiiooooouuuuu".toCharArray();
    JLabel letraLabel;
    Point posLetra;
    String letra;
    private Random rand = new Random();

    
    public LetraJuego(Point posLetra){
        char letraAleatoria = letras[rand.nextInt(letras.length)];
        letra = Character.toString(letraAleatoria);
        letraLabel = new JLabel(letra);
        Font font = new Font("Comic Sans MS", Font.PLAIN, 16);
        letraLabel.setFont(font);
        letraLabel.setSize(20, 25);
        
        this.posLetra = posLetra;
        
        letraLabel.setLocation(posLetra);
        
    }
    
}
