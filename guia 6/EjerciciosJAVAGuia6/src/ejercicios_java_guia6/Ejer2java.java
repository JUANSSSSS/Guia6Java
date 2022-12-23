package ejercicios_java_guia6;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanb
 */
public class Ejer2java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = sc.nextLine();
        System.out.println("Me queda claro tu nombre es: " + nombre);
    }
}
