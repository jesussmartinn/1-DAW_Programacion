/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio24;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio24 {

    
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca su nombre: ");
        String nombre = entrada.nextLine();
        
        return nombre;
    }
    
    
    public static int pedirEdad(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca su edad: ");
        int edad = entrada.nextInt();
        
        return edad;
    }
    
    
    public static void mayorDeEdad(String nombre, int edad){
        if(edad > 18){
            System.out.println("El usuario llamado " + nombre + " es mayor de edad");
        }else{
            System.out.println("El usuario llamado " + nombre + " es menor de edad");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = pedirNombre();
        int edad = pedirEdad();
        
        mayorDeEdad(nombre, edad);
    }
}
