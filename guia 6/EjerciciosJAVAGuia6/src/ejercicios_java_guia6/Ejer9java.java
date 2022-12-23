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
public class Ejer9java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase,letra;
        boolean flag;
        flag = false;
        do{
            System.out.println("Ingresa una frase");
            frase = sc.nextLine();
            letra = frase.substring(0,1);
            letra = letra.toUpperCase();
            if (letra.equals("A")){
                System.out.println("CORRECTO");
                flag = true;
            }else{
                System.out.println("InCORRECTO");
            }
        }while(flag == false);
    }
    
}
