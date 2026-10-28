/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio20;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio20 {

    //Variables fijas
    static final String CAPITAL = "Madrid";
    static final String AMERICA = "Colón";
    
    /**
     * Método que realiza la pregunta 1 y comprueba si la respuesta es correcta 
     * o no y añade su nota correspondiente.
     * @return 
     */
    public static int pregunta1(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Cuál es la capital de España?: ");
        String respuesta = entrada.nextLine();
        
        if(respuesta.equalsIgnoreCase(CAPITAL)){
            System.out.println("Muy bien, respuesta correcta.");
            return 5;
        }else{
            System.out.println("No es correcto. La respuesta "
                    + " correcta sería" + CAPITAL);
            return 0;
        }
    }
    
    /**
     * Método que realiza la pregunta 2 y comprueba si la respuesta es correcta 
     * o no y añade su nota correspondiente.
     * @return 
     */
    public static int pregunta2(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Quién descubrió América?: ");
        String respuesta = entrada.nextLine();
        
        if(respuesta.equalsIgnoreCase(AMERICA) || respuesta.equalsIgnoreCase("Colon")){
            System.out.println("Muy bien, respuesta correcta.");
            return 5;
        }else{
            System.out.println("No es correcto. La respuesta "
                    + " correcta sería" + AMERICA);
            return 0;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("EXAMEN DE CULTURA GENERAL");
        
        int nota = pregunta1() + pregunta2();
        
        System.out.println("NOTA DEL EXAMEN: " + nota);
    }
}
