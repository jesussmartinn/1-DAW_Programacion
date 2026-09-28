/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema02_ejercicio23;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema02_Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dinero = new Scanner(System.in);
        System.out.println("Por favor, introduzca el precio del modelo de ordenador"
                + " que desea comprar: ");
        float precio = dinero.nextFloat();
        
        Scanner cuantas = new Scanner(System.in);
        System.out.println("¿Cuántas unidades quiere llevarse?");
        float cantidad = cuantas.nextFloat();
       
        float total;
        total = cantidad * precio;
        
        System.out.println("El precio total de su compra es de: " + total + " Euros."); 
    }
}
