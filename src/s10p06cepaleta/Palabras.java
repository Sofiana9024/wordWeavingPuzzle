/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s10p06cepaleta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author LenovoLap
 */
public class Palabras {
//    ArrayList<String> facil = new ArrayList<String>(Arrays.asList("cabra", "cabra", "cabra", "cabra", "cabra", "cabra", "cabra", "cabra", "cabra", "cabra"));
    ArrayList<String> facil = new ArrayList<String>(Arrays.asList("barco", "cebra", "actor", "tocar", "pelar", "silla", "negro", "nariz", "traje", "dolar"));
    ArrayList<String> dificil = new ArrayList<String>(Arrays.asList("multar", "vestir", "chisme", "ingles", "marfil", "pincel", "sirena", "soltar", "suplir", "quedar"));
    ArrayList<String> experto = new ArrayList<String>(Arrays.asList("acuerdo", "cortado", "durango", "logista", "funeral", "flexion", "habitos", "mineral", "mediano", "levitar"));
    String pfinal;
    int nivel;
    private Random rand = new Random();
    
    public Palabras(int x){  //Se obtiene la palabra y dependiendo de la dificultad se elige la palabra
        this.nivel = x; //se guarda el nivel para luego usarlo desde objetos creados en otra clase
        int indice = rand.nextInt(9);
        switch(x){
            case 1 -> {
                pfinal = facil.get(indice);
            }
            case 2 -> {
                pfinal = dificil.get(indice);
            }
            case 3 -> {
                pfinal = experto.get(indice);
            }
        }
        System.out.println("La palabra es: " + pfinal); //Solo de prueba
}
    
    public int verificarLetra(char c){ //Para ver si la letra elegida está en la palabra
        int bandera = 100;
        for (int i = 0; i < pfinal.length(); i++) {
            if(pfinal.charAt(i) == c){
                bandera = i; //Si existe la letra en la palabra, ademas de que devuelve la posicion en la que está
            }
        }
        return bandera;
    }
    
}
