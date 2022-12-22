
package aprendizaje_Java6;

import java.util.Scanner;

   /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/

public class Ejer_12java {

    
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String frase,letra1,letra2;
        int errores,limite,letrasCorrectas;
        errores = 0;
        letrasCorrectas = 0;
        do{
          System.out.println("ingrese la palabra o &&&&& para terminar");
            frase = sc.nextLine();
            frase = frase.toUpperCase();
            limite = frase.length();
            if  (limite > 5){
              errores ++;
            System.out.println("la frase es incorrecta");   
            }
            else {
               letra1 = frase.substring(0, 1);
                letra2 = frase.substring(limite - 1, limite);
                if(letra1.equals("X") && letra2.equals("O")){
                    letrasCorrectas++;
                    System.out.println("---CORRECTO---");
            } else {
                    errores++;
                    System.out.println("---INCORRECTO---"); 
                }
            }   
        } while(!frase.equals("&&&&&"));
        errores --;
        System.out.println("-----------------");
        System.out.println("Acertaste: " + letrasCorrectas + " veces");
        System.out.println("Fallaste: " + errores + " veces");
    }
}            
            
        
           
       
            
         
                
            
        
    
    
   
        
                 
        
    
    

