package ejercicios_java_guia6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author juanb
 */
public class Ejer_12java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase,letra1,letra2;
        int len,contE,cont;
        contE = 0;
        cont = 0;       
        do {
            System.out.println("Ingresa la frase O (&&&&&) para terminar");
            frase = sc.nextLine();
            frase = frase.toUpperCase();
            len = frase.length();
            if (len > 5) {
                contE++;
                System.out.println("La frase fue incorrecta");
            } else {
                letra1 = frase.substring(0, 1);
                letra2 = frase.substring(len - 1, len);
                if(letra1.equals("X") && letra2.equals("O")){
                    cont++;
                    System.out.println("---CORRECTO---");
                }else{
                    contE++;
                    System.out.println("---INCORRECTO---");
                }
            }
        }while(!frase.equals("&&&&&"));
        contE--;
        System.out.println("-----------------");
        System.out.println("Acertaste: " + cont + " veces");
        System.out.println("Fallaste: " + contE + " veces");
    }
}
