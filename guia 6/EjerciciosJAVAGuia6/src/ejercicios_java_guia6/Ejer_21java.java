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
public class Ejer_21java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];               
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int)(Math.random()*100);
                System.out.print("[" + matrizM[i][j] + "]");
            }
            System.out.println("");
        }
                System.out.println("------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j] = (int)(Math.random()*100);
                System.out.print("[" + matrizP[i][j] + "]");
            }
            System.out.println("");
        }
        comprobar(matrizM,matrizP);
    }
    public static void comprobar(int[][] matrizM,int[][] matrizP){
        System.out.println("-------------");
        int[][] matrizAux = new int[3][3];
        int cont,cord1,cord2;
        cont = 0;
        boolean flag = true;
        for (int i = 0; i < 10; i++) {
            cord1 = i;
            for (int j = 0; j < 10; j++) {
                cord2 = j;
                if (i < 7 && j < 7) {
                    if (matrizP[0][0] == matrizM[i][j]) {
                        for (int k = 0; k < 3; k++) {
                            for (int l = 0; l < 3; l++) {
                                matrizAux[k][l] = matrizM[cord1][cord2];
                                cord2++;
                            }
                            cord2 = j;
                            cord1++;
                        }
                        for (int z = 0; z < 3; z++) {
                            for (int x = 0; x < 3; x++) {
                                if (matrizAux[z][x] == matrizP[z][x]) {
                                    cont++;
                                }
                            }
                        }
                        if (cont == 9) {
                            flag = false;
                            System.out.println("La matrizP se encuentra en la matrizM desde la posiscion " + i + ":" + j);
                        }else{
                            cont = 0;
                        }
                    }

                }
            }
        if (i >= 9 && flag == true) {
            System.out.println("La matrizP no se encuentra dentro de la matrizM");
        }
        }  
    }
}
