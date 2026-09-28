/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema02_ejercicio21;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema02_Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner segundos = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número de segundos: ");
        
        int entrada = segundos.nextInt();
        int dias;
        int horas;
        int min;
        int seg;
        
        dias = entrada / 86400;
        
        horas = (entrada % 86400)/3600;

        min = (entrada % 3600) / 60;

        seg = entrada % 60;
        
        System.out.println(entrada + " segundos hacen un total de: " + dias + " días, " + horas
                + " horas, " + min + " minutos y " + seg + " segundos.");
                
        
    }
    
}
