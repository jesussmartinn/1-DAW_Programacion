/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio10;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema05_Ejercicio10 {

    //Método que pide un número al usuario, crea un objeto Numero con él y lo devuelve
    public static Numero pedirNumero(int posicion){
        Scanner teclado = new Scanner(System.in);
        int valor;
        
        System.out.print("Introduzca el número " + posicion + ": ");
        valor = teclado.nextInt();
        
        return new Numero(valor);
    }
    
    //Método que ordena los cuatro números enteros introducidos por teclado
    //de forma creciente
    public static void ordenCreciente(Numero num1, Numero num2, Numero num3, Numero num4) {
        int aux;

        for (int i = 0; i < 3; i++) {
            // Comparamos el 1º con el 2º
            if (num1.getValor() > num2.getValor()) {
                aux = num1.getValor();
                num1.setValor(num2.getValor());
                num2.setValor(aux);
            }

            // Comparamos el 2º con el 3º
            if (num2.getValor() > num3.getValor()) {
                aux = num2.getValor();
                num2.setValor(num3.getValor()); 
                num3.setValor(aux);
            }

            // Comparamos el 3º con el 4º
            if (num3.getValor() > num4.getValor()) {
                aux = num3.getValor();
                num3.setValor(num4.getValor());
                num4.setValor(aux);
            }
        }
    }
    
    //Método que muestra por pantalla el orden de forma creciente
    public static void mostrarOrden(Numero num1, Numero num2, Numero num3, Numero num4){
        System.out.println("El orden de los numeros introducidos en orden creciente"
                + " es: " + num1.getValor() + " - " + num2.getValor() + " - " 
                + num3.getValor() + " - " + num4.getValor());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numero num1, num2, num3, num4;
        
        //Pedimos los tres números (cada uno es un objeto)
        num1 = pedirNumero(1);
        num2 = pedirNumero(2);
        num3 = pedirNumero(3);
        num4 = pedirNumero(4);
        
        //Lo ordenamos y lo mostramos
        ordenCreciente(num1, num2, num3, num4);
        mostrarOrden(num1, num2, num3, num4);
        
    }
    
}
