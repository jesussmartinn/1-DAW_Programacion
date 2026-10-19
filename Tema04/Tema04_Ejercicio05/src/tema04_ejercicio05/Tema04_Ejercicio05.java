/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio05;
import java.util.Scanner;
import Operaciones.Operaciones;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un número: ");
        int num = entrada.nextInt();
        
        //Llamada al módulo paridad(num)
        Operaciones.Paridad(num);
    }
    
}
