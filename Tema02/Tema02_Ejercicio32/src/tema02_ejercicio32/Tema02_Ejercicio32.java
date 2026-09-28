/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema02_ejercicio32;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tema02_Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitamos la cantidad de dinero
        Scanner dinero = new Scanner(System.in);
        
        System.out.print("Por favor, indique una cantidad de dinero: ");
        int importe = dinero.nextInt();

        // Guardamos el valor original para mostrarlo al final
        int cantidadRestante = importe;

        // Calculamos los billetes de 50
        int billetes50 = cantidadRestante / 50;
        cantidadRestante = cantidadRestante % 50;

        // Calculamos los billetes de 20
        int billetes20 = cantidadRestante / 20;
        cantidadRestante = cantidadRestante % 20;

        // Calculamos los billetes de 10
        int billetes10 = cantidadRestante / 10;
        cantidadRestante = cantidadRestante % 10;

        // Calculamos los billetes de 5
        int billetes5 = cantidadRestante / 5;
        cantidadRestante = cantidadRestante % 5;

        // Calculamos las monedas de 2
        int monedas2 = cantidadRestante / 2;

        // Lo que sobra son directamente las monedas de 1
        int monedas1 = cantidadRestante % 2;

        // Mostramos el resultado con el formato exacto del ejemplo
        System.out.println(importe + " Euros se descomponen en " + billetes50 + " billetes de 50, "
                + billetes20 + " billetes de 20, "
                + billetes10 + " billetes de 10, "
                + billetes5 + " billetes de 5, "
                + monedas2 + " monedas de 2 euros y "
                + monedas1 + " monedas de 1 euro.");
    }
    
}
