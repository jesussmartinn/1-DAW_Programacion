/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio31;

/**
 *
 * @author User
 */
public class Tema03_Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int imparesEncontrados = 0;
        int totalGenerados = 0;
        String numerosImpares = "";

        while (imparesEncontrados < 3) {
            int num = (int) (Math.random() * 100) + 1;
            totalGenerados++;
            
            if (num % 2 != 0) {
                numerosImpares += num + " ";
                imparesEncontrados++;
            }
        }

        System.out.println("Los 3 números impares generados son: " + numerosImpares);
        System.out.println("Cantidad de valores aleatorios necesarios: " + totalGenerados);
    }
    
}
