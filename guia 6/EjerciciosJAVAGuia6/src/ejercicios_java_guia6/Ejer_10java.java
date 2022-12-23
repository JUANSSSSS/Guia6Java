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
public class Ejer_10java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limit,suma,num;
        suma = 0;
        System.out.println("Ingresa un valor limite");
        limit = leer.nextInt();
        while(suma < limit){
            System.out.println("-----------------");
            System.out.println("Ingresa un numero");
            num = leer.nextInt();
            suma += num;
        }
        System.out.println("La suma de los numeros es: " + suma);
    }
    
}
