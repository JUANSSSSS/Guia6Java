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
public class Ejer_13java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un numero");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i ==n - 1){
                    System.out.print("*");
                }else if(j == 0 || j == n - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
    }
    
}
