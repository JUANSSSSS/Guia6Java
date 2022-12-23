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
public class Ejer_15java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[100];
        for (int i = 99; i > 0; i--) {
            vector[i] = i;
            System.out.println(vector[i]);  
        }
        for (int i = 10; i > 10; i--) {
            System.out.println(i);
        }
    }
}
