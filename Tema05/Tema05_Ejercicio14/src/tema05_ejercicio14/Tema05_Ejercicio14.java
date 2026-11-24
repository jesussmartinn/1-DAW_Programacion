/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio14;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema05_Ejercicio14 {

    //Constante con el último número por el que se multiplica en la tabla
    final static int LIMITE = 10;

    //Método que pide un número al usuario y se lo asigna al atributo valor del objeto
    public static void asignarValor(Numero numero) {
        Scanner teclado = new Scanner(System.in);
        int valor;

        System.out.print("Introduzca el número del que quiere la tabla de multiplicar: ");
        valor = teclado.nextInt();
        numero.setValor(valor);
    }

    //Método que muestra por pantalla la tabla de multiplicar completa del objeto
    public static void mostrarTabla(Numero numero) {
        System.out.println("Tabla de multiplicar del " + numero.getValor() + ":");
        for (int i = 1; i <= LIMITE; i++) {
            System.out.println(numero.getValor() + " * " + i + " = " + (numero.getValor() * i));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el objeto con el constructor por defecto
        Numero numero = new Numero();

        //Le asignamos el número que elija el usuario
        asignarValor(numero);

        //Mostramos su tabla de multiplicar
        mostrarTabla(numero);
    }
    
}
