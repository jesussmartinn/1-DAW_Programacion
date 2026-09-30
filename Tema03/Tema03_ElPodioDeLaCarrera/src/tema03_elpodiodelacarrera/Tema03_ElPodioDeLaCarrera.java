/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_elpodiodelacarrera;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema03_ElPodioDeLaCarrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tiempos = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el tiempo del primer"
                + " participante en segundos: ");
        int t1 = tiempos.nextInt();
        
        System.out.println("Ahora, introduzca el tiempo del segundo"
                + " participante en segundos: ");
        int t2 = tiempos.nextInt();
        
        System.out.println("Introduzca el tiempo del tercer"
                + " participante en segundos: ");
        int t3 = tiempos.nextInt();
        
        System.out.println("Por último, introduzca el tiempo del cuarto"
                + " participante en segundos: ");
        int t4 = tiempos.nextInt();
        
        int aux;
        int dif;

        // Comparamos el 1º con el 2º
        if (t1 > t2) {
            aux = t1;
            t1 = t2;
            t2 = aux;
        }

        // Comparamos el 2º con el 3º
        if (t2 > t3) {
            aux = t2;
            t2 = t3;
            t3 = aux;
        }

        // Comparamos el 3º con el 4º
        if (t3 > t4) {
            aux = t3;
            t3= t4;
            t4 = aux;
        }

        // Repetimos el proceso para asegurar que los demás también se ordenen
        if (t1 > t2) {
            aux = t1;
            t1 = t2;
            t2 = aux;
        }

        if (t2 > t3) {
            aux = t2;
            t2 = t3;
            t3 = aux;
        }

        // Última comprobación para los dos primeros
        if (t1 > t2) {
            aux = t1;
            t1 = t2;
            t2 = aux;
        }
        System.out.println("1º puesto: " + t1 + "s" + " |" + " 2º puesto: " + t2);
        System.out.println("3º puesto: " + t3 + "s" + " |" + " 4º puesto: " + t4);

        //Apartado 4 y 5
        if(t1 == t2){
            System.out.println("Hay empate en el primer puesto");
            dif = 0;
        }
        else{
            dif = t2 - t1;
            System.out.println("La diferencia de segundos entre el 1º y el 2º puesto"
                    + " es de: " + dif + "s");
        }
        
        //Apartado 6
        if(t1 == t2 || t2 == t3 || t3 == t4){
            System.out.println("Hay tiempos iguales");
        }
        else{
            System.out.println("Todos los tiempos son distintos");
        }
        
        //RETO 2
        if (t1 != t2) {
            System.out.println("1 ganador único.");
        } else if (t2 != t3) {
            System.out.println("2 empatados en cabeza.");
        } else if (t3 != t4) {
            System.out.println("3 empatados en cabeza.");
        } else {
            System.out.println("4 empatados en cabeza.");
        }
        
        //RETO 3
        int dif1 = t2 - t1;
        int dif2 = t3 - t2;
        int dif3 = t4 - t3;

        if (dif1 == dif2 && dif2 == dif3) {
            System.out.println("Tiempos consecutivos: Sí (Constante de " + dif1 + "s).");
        } else {
            System.out.println("Tiempos consecutivos: No.");
        }
        
        //RETO 4
        
    }
    
}
