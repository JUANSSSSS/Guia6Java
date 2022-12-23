package ejercicios_java_guia6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author juanb
 */
public class Ejer6java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero voy a ver si es par o impar");
        num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Este numero es par");
        }else{
            System.out.println("Este numero no es par");
        }
    }
    
}
