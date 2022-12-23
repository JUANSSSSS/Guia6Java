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
public class Ejer_19java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizAT = new int[3][3];
        boolean[][] flags = new boolean[3][3];
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("LLenando la posision: " + i + ":" + j);
                matrizA[i][j] = sc.nextInt();
            }
        }
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("---------");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matrizAT[i][j] = matrizA[j][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizAT[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matrizA[i][j] + matrizAT[i][j] == 0){
                    flags[i][j] = true;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(flags[i][j] == true){
                    cont++;
                }
            }
        }
        if (cont == 9) {
            System.out.println("Esta matriz es anti simetrica");
        }else{
            System.out.println("esta matriz no es anti simetrica");
        }
    }
    
}
