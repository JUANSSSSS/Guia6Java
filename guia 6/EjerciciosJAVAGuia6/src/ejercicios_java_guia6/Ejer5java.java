/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java_guia6;
import java.util.Scanner;
/**
 *
 * @author juanb
 */
public class Ejer5java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero");
        num = sc.nextInt();
        System.out.println("El doble de eso es " + (num*2));
        System.out.println("El triple de eso es " + (num*3));
        System.out.println("La raiz cuadrada de eso es " + Math.sqrt(num));
    }
    
}
