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
public class Ejer7java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag;
        String frase;
        flag = false;
        do{
        System.out.println("Ingresa una frase vere si es correcta ");
        frase = sc.nextLine();
        frase = frase.toLowerCase();
        if (frase.equals("eureka")){
            System.out.println("---!Correcto!---");
            flag = true;
        }else{
            System.out.println("No era esa vuelve a intentar");
        }
        }while (flag == false);  
    }  
}
