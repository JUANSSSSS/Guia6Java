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
public class Ejer3java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Dame una frase");
        System.out.println("--------------");
        frase = sc.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println("--------------");
        System.out.println(frase.toLowerCase());
    }
}
