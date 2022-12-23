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
public class Ejer_16java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n,num,cont;
    cont = 0;
    System.out.println("Ingresa el tamaño del vector");
    n = sc.nextInt();
    int[] vector = new int[n];
    n -= 1;
        for (int i = 0; i < n; i++) {
           vector[i] = (int)(Math.random()* 10);
        }
    System.out.println("Ingresa un numero para buscar en el vector");
    num = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (vector[i] == num){
                System.out.println("Esta en la posision:" + i);
                cont++;
            }
        }
        if (cont > 1){
        System.out.println("El numero se encontro " + cont + " veces");
        }else{
            System.out.println("El numero no se encontró");
        }
    }
    
}
