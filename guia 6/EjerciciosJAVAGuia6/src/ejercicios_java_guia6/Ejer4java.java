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
public class Ejer4java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double grados,F;
        System.out.println("Dame los grados");
        grados = sc.nextDouble();
        F = 32 + (9*grados/5);
        System.out.println(grados + " En fahrenheit es: " + F);
    }
}
