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
public class Ejer_11java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,suma,mul,res,opcion;
        double div;
        boolean flag;
        String op;
        flag = true;
        System.out.println("Ingresa el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        num2 = sc.nextInt();
        do{
            System.out.println("----------------");
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("ELIJA UNA OPCION");
            System.out.println("----------------");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    suma = num1 + num2; 
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    res = num1 - num2;
                    System.out.println("La resta es: " + res);
                    break;
                case 3:
                    mul = num1 * num2;
                    System.out.println("La multiplicacion es: " + mul);
                    break;
                case 4:
                    div = num1 / num2;
                    System.out.println("La division es: " + div);
                    break;
                case 5:
                    System.out.println("Desea salir S/N");
                    op = sc.next();
                    op = op.toUpperCase();
                    if(op.equals("S")){
                        flag = false;
                        System.out.println("---Saliendo---");
                    }
                    break;
            }
        }while(flag == true);
    }
    
}
