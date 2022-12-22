
package aprendizaje_Java6;

import java.util.Scanner;
 
/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/


public class Ejer1java {

    
    
    public static void main(String[] args) {
        Scanner leer = new  Scanner (System.in);
        int num1 ;
        System.out.println("ingrese el primer numero ");
        num1 = leer.nextInt();
        int num2 ;
        System.out.println("ingrese el segundo numero ");
        num2 = leer.nextInt();
        int suma;
        suma = num1 +num2;
        
        System.out.println("su resultado es "+suma ) ;
        
        
        
        
        
        
        


    }
    
}
