/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema04_ejercicio09;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Operaciones {
    
    /**
     * Método que devuelve el número que introduzca el usuario por teclado
     * @return 
    */
    public static int pedirNumero(String mensaje){
        //Declaramos el Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos al usuario un número por pantalla
        System.out.println(mensaje);
        int num = entrada.nextInt();
        
        return num;
    }

    public static void menor(int num1, int num2, int num3){
        if(num1 < num2 && num1 < num3){
            System.out.println("El menor de los tres números es: " + 
                    num1);
        }else if(num2 < num1 && num2 < num3){
            System.out.println("El menor de los tres números es: " + 
                    num2);
        }else{
            System.out.println("El menor de los tres números es: " + 
                    num3);
        }
    }
}
