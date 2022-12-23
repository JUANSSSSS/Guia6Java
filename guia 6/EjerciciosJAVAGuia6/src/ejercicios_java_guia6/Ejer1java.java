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
public class Ejer1java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma,num1,num2;
        System.out.println("Ingresa dos numeros para sumar");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        suma = num1 + num2;
        System.out.println("La suma de estos numeros es: " + suma);
    }
    
}
