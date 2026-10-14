/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio32;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema03_Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el año actual: ");
        int anioActual = scanner.nextInt();
        System.out.print("Introduzca el mes actual: ");
        int mesActual = scanner.nextInt();
        System.out.print("Introduzca el día actual: ");
        int diaActual = scanner.nextInt();

        System.out.print("Ahora, introduzca su año de nacimiento: ");
        int anioNac = scanner.nextInt();
        System.out.print("Introduzca su mes de nacimiento: ");
        int mesNac = scanner.nextInt();
        System.out.print("Por último introduzca su día de nacimiento: ");
        int diaNac = scanner.nextInt();

        int edadAnios = anioActual - anioNac;
        int edadMeses = mesActual - mesNac;
        int edadDias = diaActual - diaNac;

        // Ajuste en caso de que los días o meses sean negativos
        if (edadDias < 0) {
            System.out.println("ERROR");
            
        }else if(edadMeses < 0) {
            System.out.println("ERROR");
        }else if(edadAnios < 0){
            System.out.println("ERROR");
        }

        System.out.println("Su edad exacta es de " + edadAnios + " años, " + edadMeses + " meses y " + edadDias + " días.");
    }
    
}
