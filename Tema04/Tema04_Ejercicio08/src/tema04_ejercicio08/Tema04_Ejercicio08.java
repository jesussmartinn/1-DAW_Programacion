/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio08;
import java.util.Scanner;
import Operaciones.Operaciones;
/**
 *
 * @author User
 */
public class Tema04_Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Indique una cantidad de dinero: ");
        int dinero = entrada.nextInt();
        
        Operaciones.nBilletes(dinero);
    }
    
}
