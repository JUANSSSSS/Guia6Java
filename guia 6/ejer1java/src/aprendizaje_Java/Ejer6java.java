
package aprendizaje_Java;

import java.util.Scanner;


public class Ejer6java {
   /*Crear un programa que dado un numero determine si es par o impar.*/
   
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese su numero");
        numero = sc.nextInt();
        
        if (numero % 2==0){
            System.out.println("su numero es par ");
        }else {
            System.out.println("su numero es inpar ");
        }
        
        
     
                }
    
}
