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
public class Ejer_14java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eur;
        String moneda;
        System.out.println("Ingresa la cantidad de euros a cambiar");
        eur = sc.nextInt();
        System.out.println("Ingresa la moneda a la que lo quieres cambiar");
        moneda = sc.next();
        cambio(eur,moneda);
    }
    public static void cambio(double num,String moneda){
        double[] vector = new double[3];
        vector[0] = 0.86;
        vector[1] = 1.28611;
        vector[2] = 129.879;

        switch(moneda){
            case "libras":
                num *= vector[0];
                System.out.println("Ahora tienes " + num + " Libras");
                break;
            case "dolares":
                num *= vector[1];
                System.out.println("Ahora tienes " + num + " Dolares");
                break;
            case "yenes":
                num *= vector[2];
                System.out.println("Ahora tienes " + num + " Yenes");
                break;
        }
    }
    
}
