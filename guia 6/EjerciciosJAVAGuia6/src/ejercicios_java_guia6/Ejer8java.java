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
public class Ejer8java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String frase;
       boolean flag;
       flag = true;
       do{
           System.out.println("Ingresa una frase de 8 caracteres");
           frase = sc.nextLine();
           if (frase.length() == 8){
               System.out.println("Muy bien tu frase es de 8 caracteres");
               flag = false;
           }else{
               System.out.println("Vuelve a intentar"); 
               flag = true;
           }
       }while(flag == true);
    }
    
}
