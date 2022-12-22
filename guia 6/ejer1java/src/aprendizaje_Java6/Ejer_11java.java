
package aprendizaje_Java6;

import java.util.Scanner;

/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/

public class Ejer_11java {

    
    public static void main(String[] args) {
        int num1,num2,suma,resta,divi,multi, opcion;
        boolean flag = false;
        String op;
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = sc.nextInt();
        do{
            System.out.println("--MENU--");
            System.out.println("--------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Division");
            System.out.println("4. Multiplicacion");
            System.out.println("5. Elija opcion S/N");
            opcion = sc.nextInt();
        switch (opcion){
            case 1:suma=num1 + num2;
                System.out.println("la suma es: " + suma);
                break;
            case 2: resta=num1 - num2;
                System.out.println("la resta es: " + resta);
                break;
            case 3: divi=num1 / num2;
                System.out.println("la division es: " + divi);
                break;
            case 4: multi=num1 * num2;
                System.out.println("la multiplicacion es " + multi);
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

          
                  
    
    

