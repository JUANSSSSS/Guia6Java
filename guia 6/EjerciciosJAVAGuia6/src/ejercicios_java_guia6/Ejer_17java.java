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
public class Ejer_17java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,dig1,dig2,dig3,dig4,dig5;
        dig1 = 0;
        dig2 = 0;
        dig3 = 0;
        dig4 = 0;
        dig5 = 0;
        System.out.println("Ingresa el tamaño del vector");
        n = sc.nextInt();
        int[] vector = new int[n];
        n -= 1;
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random()*10000);
            System.out.println(vector[i]);
        }
        for (int i = 0; i < n; i++) {
            if (vector[i] > 1 && vector[i] < 10){
                dig1++;
            }else if(vector[i] >= 10 && vector[i] < 100){
                dig2++;
            }else if(vector[i] >= 100 && vector[i] < 1000){
                dig3++;
            }else if(vector[i] >= 1000 && vector[i] < 10000){
                dig4++;
            }else{
                dig5++;
            }
        }
        System.out.println("Hay " + dig1 + " Numeros de una cifra");
        System.out.println("Hay " + dig2 + " Numeros de dos cifras");
        System.out.println("Hay " + dig3 + " Numeros de tres cifras");
        System.out.println("Hay " + dig4 + " Numeros de cuatro cifras");
        System.out.println("Hay " + dig5 + " Numeros de cinco cifras");
    }
    
}
