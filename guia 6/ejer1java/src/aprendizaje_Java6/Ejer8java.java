
package aprendizaje_Java6;

import java.util.Scanner;

/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.*/

public class Ejer8java {

     
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String frase;
        
        System.out.println("introdizca una palabra o frase de 8 caracteres");
        frase=sc.nextLine();
        if (frase.length() == 8){
            System.out.println("su frase es correcta");
        }else {
            System.out.println("su frase es incorrecta");
        }
    }
    
}
