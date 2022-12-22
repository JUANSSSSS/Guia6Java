
package aprendizaje_Java;

import java.util.Scanner;

/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/

public class Ejer_10java {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite,suma,num;
        suma = 0 ;
        System.out.println("ingrese un numero a superar");
        limite = sc.nextInt();
        
        
        while (suma < limite){
           System.out.println("ingrese los numeros a sumar");
            num = sc.nextInt();
            suma += num ;
        }
        System.out.println("La suma de los numeros es:" + suma);
    }
    
}
