/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1_introjava;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class Ejer1_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Numero 1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese Numero 2");
        int num2 = leer.nextInt();
        int suma;
        suma = num1 + num2;
        System.out.println("La suma es"+ suma);
        // TODO code application logic here
    }
    
}
