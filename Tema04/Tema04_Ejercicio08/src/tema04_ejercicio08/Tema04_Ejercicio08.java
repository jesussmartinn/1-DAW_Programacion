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
        //Declaramos el Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos una cantidad de dinero por teclado al usuario y 
        //la recogemos en la variable
        System.out.println("Indique una cantidad de dinero: ");
        int dinero = entrada.nextInt();
        
        //Llamada al método nbilletes(dinero).
        Operaciones.nBilletes(dinero);
    }
    
}
