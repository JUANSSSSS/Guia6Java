
package aprendizaje_Java;

import java.util.Scanner;


public class Ejer3java {

    /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
    public static void main(String[] args) {
        String frase;
        Scanner fras = new Scanner(System.in);
        System.out.println("ingresa una frase");
        frase = fras.nextLine();
        
        System.out.println("su frase en mayuscula es " + frase.toUpperCase() );
        System.out.println("su frese en minuscula es " + frase.toLowerCase());
        
        
        
        
    }
    
}
