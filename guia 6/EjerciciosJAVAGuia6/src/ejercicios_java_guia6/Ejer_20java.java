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
public class Ejer_20java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingresando la posision " + i + ":" + j);
                matriz[i][j] = sc.nextInt();
            }
        }
        magica(matriz);
    }
    public static void magica(int[][] matriz){
        boolean[] flags = new boolean[3];
        int dig1,dig2,sumaF,sumaC,a;
        a = 0;
        sumaF = 0;
        sumaC = 0;
        int[] vectorF = new int[3];
        int[] vectorC = new int[3];
        dig1 = 0;
        dig2 = 0;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                sumaF  =  sumaF + matriz[i][j];
            }
            vectorF[j] = sumaF;
            sumaF = 0;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaC = sumaC + matriz[i][j];
            }
            vectorC[i] = sumaC;
            sumaC = 0;
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == j){
                    dig1 += matriz[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j > -1; j--) {
                if (i == j) {
                    dig2 += matriz[i][j];
                }
            }
        }
        
        System.out.println("----------------------");
        for (int i = 0; i < 3; i++) {
            if (vectorF[i] == vectorC[0]) {
                flags[i] = true;
            }
            if (vectorC[i] == vectorF[0]) {
                flags[i] = true;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("----------------------");
        for (int i = 0; i < 3; i++) {
            if (flags[i] == true) {
                a++;
            }
        }
        if (a == 3) {
            System.out.println("Es magica");
        }else{
            System.out.println("No es magica");
        }
    }
    
}
