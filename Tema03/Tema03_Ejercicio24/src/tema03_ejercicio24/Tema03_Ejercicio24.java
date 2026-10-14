/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio24;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tema03_Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        
        while (numero <= 0) {
            System.out.print("Introduce un número mayor que 0: ");
            numero = scanner.nextInt();
            
            if (numero <= 0) {
                System.out.println("Error: El número debe ser mayor que 0.");
            }
        }
        
        int contador = 0;
        System.out.println("Múltiplos de 3 entre 1 y " + numero + ":");
        for (int i = 2; i < numero; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }
    }
    
}
