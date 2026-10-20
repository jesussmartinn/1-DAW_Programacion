/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author User
 */
public class Operaciones {
    
    public static void nBilletes(int dinero){
        int resto;
        
        System.out.println(dinero + " euros se descomponen en: ");
        // Billetes de 50
        int billete50 = dinero / 50;
        resto = dinero % 50;
        if (billete50 > 0) {
            System.out.println("Billetes de 50 euros: " + billete50);
        }
        
        // Billetes de 20
        int billete20 = resto / 20;
        resto = resto % 20;
        if (billete20 > 0) {
            System.out.println("Billetes de 20 euros: " + billete20);
        }
        
        // Billetes de 10
        int billete10 = resto / 10;
        resto = resto % 10;
        if (billete10 > 0) {
            System.out.println("Billetes de 10 euros: " + billete10);
        }
        
        // Billetes de 5
        int billete5 = resto / 5;
        resto = resto % 5;
        if (billete5 > 0) {
            System.out.println("Billetes de 5 euros: " + billete5);
        }
        
        // Monedas de 2
        int moneda2 = resto / 2;
        resto = resto % 2;
        if (moneda2 > 0) {
            System.out.println("Monedas de 2 euros: " + moneda2);
        }
        
        // Monedas de 1
        int moneda1 = resto / 1;
        if (moneda1 > 0) {
            System.out.println("Monedas de 1 euro: " + moneda2);
        }
    }
}
