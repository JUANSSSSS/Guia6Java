
package aprendizaje_Java;

import java.util.Scanner;

/* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */

public class Ejer4java {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int grados;
        System.out.println("ingrese los grados a convertir");
        grados = sc.nextInt();
        grados =  32+(9*grados/5); 
        System.out.println("la conversion es " + grados);
    }
    
}
