/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio34;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tema03_Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Día de salida (número): ");
        int diaSalida = scanner.nextInt();
        System.out.print("Hora de salida (0-23): ");
        int horaSalida = scanner.nextInt();
        System.out.print("Minuto de salida (0-59): ");
        int minSalida = scanner.nextInt();

        System.out.print("Día de llegada (número): ");
        int diaLlegada = scanner.nextInt();
        System.out.print("Hora de llegada (0-23): ");
        int horaLlegada = scanner.nextInt();
        System.out.print("Minuto de llegada (0-59): ");
        int minLlegada = scanner.nextInt();

        // Conversión a minutos totales para facilitar el cálculo
        int tiempoSalida = (diaSalida * 24 * 60) + (horaSalida * 60) + minSalida;
        int tiempoLlegada = (diaLlegada * 24 * 60) + (horaLlegada * 60) + minLlegada;

        if (tiempoLlegada < tiempoSalida) {
            System.out.println("Error: La fecha/hora de llegada no puede ser anterior a la de salida.");
        } else {
            int diferenciaMinutos = tiempoLlegada - tiempoSalida;
            int horasTotales = diferenciaMinutos / 60;
            int minutosRestantes = diferenciaMinutos % 60;
            
            System.out.println("El tren tarda " + horasTotales + " horas y " + minutosRestantes + " minutos en llegar a su destino.");
        }
    }
    
}
