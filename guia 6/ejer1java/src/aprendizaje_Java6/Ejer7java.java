
package aprendizaje_Java6;

import java.util.Scanner;


public class Ejer7java {
    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
      pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
      la función equals() en Java.*/
    
    public static void main(String[] args) {
       String frase;
       String eureka;
       Scanner sc =new Scanner (System.in);
       System.out.println("ingrese la frase");
       frase = sc.nextLine();
       frase = frase.toLowerCase();
       if (frase.equals("eureka")){
           System.out.println("correcto");
       }else {
           System.out.println("incorrecto");        
                   }
       }
    }
    

