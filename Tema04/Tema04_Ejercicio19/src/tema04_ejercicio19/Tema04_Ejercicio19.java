/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio19;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio19 {

    /**
     * Método que devuelve el día que nos introduce por teclado el usuario
     * @return 
     */
    public static String pedirDia(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un día de la semana: ");
        String dia = entrada.nextLine();
        
        return dia;
    }
    
    /**
     * Método que, según el día que nos de el usuario, le dice cual es su posición
     * correspondiente de la semana.
     */
    public static void diaSemana(){
        String dia = pedirDia();
        
        /**
        *Añado la funcion toLowerCase() para que el usuario pueda escribir como quiera
        *su respuesta y no haya problemas con mayúsculas o minúsculas, ya que esta función
        *pasa todo a minúsculas para hacer la comprobación.
        * */
        //Añado también las opciones con tilde y sin tilde de las opciones correspondientes
        switch(dia.toLowerCase()){
            case "lunes" -> System.out.println("El " + dia + " es el primer día de la semana");
            case "martes" -> System.out.println("El " + dia + " es el segundo día de la semana");
            case "miércoles", "miercoles" -> System.out.println("El " + dia + " es el tercer día de la semana");
            case "jueves" -> System.out.println("El " + dia + " es el cuarto día de la semana");
            case "viernes" -> System.out.println("El " + dia + " es el quinto día de la semana");
            case "sábado", "sabado" -> System.out.println("El " + dia + " es el sexto día de la semana");
            case "domingo" -> System.out.println("El " + dia + " es el séptimo día de la semana");
            default -> System.out.println("Día no válido");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        diaSemana();
    }
    
}
