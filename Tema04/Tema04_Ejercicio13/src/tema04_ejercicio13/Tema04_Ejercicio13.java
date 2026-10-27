/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio13;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio13 {

    /**
     * Método que devuelve el número que introduzca el usuario por teclado
     * @return 
     */
    public static int pedirNumero(){
        //Declaramos el Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos al usuario un número por pantalla
        System.out.println("Por favor, introduzca un número mayor que 1: ");
        int num = entrada.nextInt();
        
        return num;
    }
    
    /**
     * Método que nos dice si el número introducido es mayor que uno o no.
     * True: es mayor, false en caso contrario
     * @param num
     * @return 
     */
    public static boolean esMayorQueUno(int num){
        return num > 1;
    }
    
    public static void mostrarNumeros(int limite){
        System.out.println("Números entre 1 y " + limite + ":");
        for(int i = 1; i <= limite; i++){
            System.out.println(i);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        do{
            num = pedirNumero();
            System.out.println("Error: el número debe ser mayor que 1.");
        }while(!esMayorQueUno(num));

        mostrarNumeros(num);
    }
}
