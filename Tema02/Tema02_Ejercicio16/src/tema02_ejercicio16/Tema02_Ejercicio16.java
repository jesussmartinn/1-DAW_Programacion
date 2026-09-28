/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema02_ejercicio16;

/**
 *
 * @author alumno
 */
public class Tema02_Ejercicio16 {
    static int dinero = 130;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int billeteCincuenta;
        int billeteDiez;
        int resto;
        
        billeteCincuenta = dinero / 50;
        resto = dinero % 50;
        billeteDiez = resto / 10;
        
        System.out.println("130 euros hacen un total de " + billeteCincuenta +
                " billetes de 50 euros y " + billeteDiez + " billetes de 10 euros");
    }
    
}
