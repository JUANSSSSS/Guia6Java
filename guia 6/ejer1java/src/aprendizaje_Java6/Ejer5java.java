

package aprendizaje_Java6;

import java.util.Scanner;

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
  doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/

public class Ejer5java {

   
    public static void main(String[] args) {
        
        int numero;
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese su numero");
        numero = sc.nextInt();
        System.out.println("su doble es " + numero*2);
        System.out.println("su triple es " + numero*3);
        System.out.println("su raiz cuadradaes " + Math.sqrt(numero ));
    }
    
}
