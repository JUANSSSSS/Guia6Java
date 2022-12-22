
package aprendizaje_Java;

import java.util.Scanner;

/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.*/

public class Ejer9java {

   
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     String frase;
        System.out.println("ingrese frase o palabra que empieze por A");
        frase = sc.nextLine();
        frase = frase.toUpperCase();
        frase = frase.substring(0, 1);
        if(frase.equals("A")){
            System.out.println("su frase o palabra es correcta");
        }else{
            System.out.println("su frase o palabra es incorrecta");
        }
     
        
    }
    
}
