/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio12;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    
    private static final int CONTRASENA = 1234;
    private static final int INTENTOS_MAX = 3;
    
    /**
     * Método que devuelve el número que introduzca el usuario por teclado
     * @return 
     */
    public static int pedirContrasena(){
        //Declaramos el Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos al usuario dos número por pantalla
        System.out.println("Introduzca la contraseña");
        int contrasena = entrada.nextInt();
        
        return contrasena;
    }
    
    public static boolean comprueba(int contrasena){
        boolean contrasenaCorrecta = false;
        if(contrasena == CONTRASENA){
            contrasenaCorrecta = true;
        }
        return contrasenaCorrecta;
    }
    
    public static void muestraResultado(boolean acierto){
        if(acierto){
            System.out.println("¡Enhorabuena! Contraseña correcta.");
        }else{
            System.out.println("Error de acceso: has fallado " + INTENTOS_MAX + " veces.");
        }
    }
    
    public static void main(String[] args) {
        boolean acierto = false;
        int intentos = 0;
        
        while(!acierto && intentos < INTENTOS_MAX){
            acierto  = comprueba(pedirContrasena());
            intentos++;
            if(!acierto && intentos < INTENTOS_MAX){
                System.out.println("Contraseña incorrecta. Te quedan " + (INTENTOS_MAX - intentos) + " intentos.");
            }
        }
        
        muestraResultado(acierto);
    }
    
}
