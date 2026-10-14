/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio28;

/**
 *
 * @author User
 */
public class Tema03_Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aleatorioEntero = (int) (Math.random() * 100) + 1;
        System.out.println("Número generado: " + aleatorioEntero);
        
        if (aleatorioEntero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
    
}
