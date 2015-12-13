/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.util.Scanner;

/**
 *
 * @author MotherFoquita
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         long tinicio, tfinal;
        String frase = "A documentacion e todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicacion informatica";
        String fraseT;
        
        System.out.println("Escribe la siguiente frase:");
        tinicio = System.currentTimeMillis();
        do {
        System.out.println(frase);
        System.out.println("Pulsa enter para acabar");
        Scanner fraseTeclado = new Scanner(System.in);
        fraseT = fraseTeclado.nextLine();
        tfinal = System.currentTimeMillis();
        } while (!fraseT.equals(frase));
        
        System.out.println("Necesitaste "+ ((tfinal-tinicio)/1000)  +" segundos para escribir la frase");
    }
    
}
