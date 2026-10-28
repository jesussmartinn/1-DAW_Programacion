/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio21;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio21 {
 
    public static int pedirPrimero(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca el primer número: ");
        int num1 = entrada.nextInt();
        
        return num1;
    }

    public static int pedirSegundo(int num1){
        int num2;
        
        do{
            Scanner entrada = new Scanner(System.in);
            System.out.print("Introduzca un número mayor que " + num1 + ": ");
            num2 = entrada.nextInt();
            
            if(num2 <= num1){
                System.out.println("El número tiene que ser mayor que el primero.");
            }
        }while(num2 < num1);
       
        return num2;
    }

    public static void mostrarResultado(int num1, int num2){
        int suma = 0;

        for(int i = num1; i <= num2; i++){
            if(i % 2 == 0){
                suma = suma + i;
            }
        }

        System.out.println("La suma de los números pares entre " + num1 + " y " + num2 + " es: " + suma);
    }

    public static void main(String[] args) {
        int num1 = pedirPrimero();
        int num2 = pedirSegundo(num1);

        mostrarResultado(num1, num2);
    }
}