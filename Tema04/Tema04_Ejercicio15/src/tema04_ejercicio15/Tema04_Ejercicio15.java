/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio15;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio15 {

    /**
     * Método que devuelve el número que introduzca el usuario por teclado
     * @return 
     */
    public static int pedirNumero(String mensaje){
        //Declaramos el Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos al usuario un número por pantalla
        System.out.println(mensaje);
        int num = entrada.nextInt();
        
        return num;
    }
    
    public static void mostrarMenu() {
        System.out.println();
        System.out.println("---- MENÚ ----");
        System.out.println("1.- Sumar los números.");
        System.out.println("2.- Restar los números.");
        System.out.println("3.- Multiplicar los números.");
        System.out.println("4.- Dividir los números.");
        System.out.println("5.- Salir del programa.");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = pedirNumero("Introduzca el primer número: ");
        int num2 = pedirNumero("Introduzca el segundo número: ");
        int opcion;
        
         do {
            mostrarMenu();
            opcion = pedirNumero("Elija una opción: ");

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(num1, num2));
                    break;
                case 4:
                    try {
                        System.out.println("Resultado: " + dividir(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: no se puede dividir entre 0.");
                    }
                    break;
                case 5:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
    
}
