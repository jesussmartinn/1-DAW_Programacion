/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio14;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio14 {

    /**
     * Método que devuelve el número que introduzca el usuario por teclado
     * @return 
     */
    public static int pedirNumero(){
        //Declaramos el Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos al usuario un número por pantalla
        System.out.println("Por favor, introduzca un número mayor que 0: ");
        int num = entrada.nextInt();
        
        return num;
    }
    
    /**
     * Método que devuelve si un número es mayor que cero o no
     * @param num
     * @return 
     */
    public static boolean esMayorQueCero(int num) {
        return num > 0;
    }

    /**
     * Método que muestra el resultado final
     * @param num 
     */
    public static void mostrarResultado(int num) {
        int total = 0;
        System.out.println("Múltiplos de 3 entre 1 y " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                total++;
            }
        }
        System.out.println("Total de números mostrados: " + total);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        
        do{
            num = pedirNumero();
            if(esMayorQueCero(num)){
                mostrarResultado(num);
            }else{
                System.out.println("Error: el número debe ser mayor que 0.");
            }
            
        }while (!esMayorQueCero(num));
    }
}