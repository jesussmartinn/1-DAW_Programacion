/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio11;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Test {

    //Método que pide los valores al usuario y se los asigna a los dos objetos
    public static void pedirValores(Numero n1, Numero n2) {
        Scanner teclado = new Scanner(System.in);
        int valor;

        System.out.print("Introduzca el primer número: ");
        valor = teclado.nextInt();
        n1.setValor(valor);

        System.out.print("Introduzca el segundo número: ");
        valor = teclado.nextInt();
        n2.setValor(valor);
    }

    //Método que suma los valores de dos objetos Numero y muestra la operación
    public static void sumar(Numero n1, Numero n2) {
        int resultado;

        resultado = n1.getValor() + n2.getValor();
        System.out.println(n1.getValor() + " + " + n2.getValor() + " = " + resultado);
    }

    //Método que multiplica los valores de dos objetos Numero y muestra la operación
    public static void multiplicar(Numero n1, Numero n2) {
        int resultado;

        resultado = n1.getValor() * n2.getValor();
        System.out.println(n1.getValor() + " * " + n2.getValor() + " = " + resultado);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos los objetos con el constructor por defecto
        Numero n1 = new Numero();
        Numero n2 = new Numero();

        //Pedimos los valores y se los asignamos a los objetos
        pedirValores(n1, n2);

        //Si el primero es mayor que 10 se multiplican, si no se suman
        if (n1.getValor() > 10) {
            multiplicar(n1, n2);
        } else {
            sumar(n1, n2);
        }
    }
}
