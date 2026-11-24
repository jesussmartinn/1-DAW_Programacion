/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio18;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Test {

    //Método que pide un número al usuario y lo devuelve
    public static int pedirNumero(int posicion){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca el número " + posicion + ": ");
        int valor = teclado.nextInt();
        
        return valor;
    }
    
    //Método que muestra el menú por pantalla
    public static void mostrarMenu(){
        System.out.println("---Menú---");
        System.out.println("1.- Sumar los números.");
        System.out.println("2.- Restar los números.");
        System.out.println("3.- Multiplicar los números.");
        System.out.println("4.- Dividir los números.");
        System.out.println("5.- Salir del programa.");
    }
    
    //Método que pide una opción del menú al usuario y la devuelve
    public static int pedirOpcion() {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        System.out.print("Introduzca una opción: ");
        opcion = teclado.nextInt();

        return opcion;
    }
    
    //Método que suma los valores de dos objetos Numero y muestra la operación
    public static void sumar(Numero num1, Numero num2) {
        int resultado;

        resultado = num1.getValor() + num2.getValor();
        System.out.println(num1.getValor() + " + " + num2.getValor() + " = " + resultado);
    }
    
    //Método que resta los valores de dos objetos Numero y muestra la operación
    public static void restar(Numero num1, Numero num2) {
        int resultado;

        resultado = num1.getValor() - num2.getValor();
        System.out.println(num1.getValor() + " - " + num2.getValor() + " = " + resultado);
    }

    //Método que multiplica los valores de dos objetos Numero y muestra la operación
    public static void multiplicar(Numero num1, Numero num2) {
        int resultado;

        resultado = num1.getValor() * num2.getValor();
        System.out.println(num1.getValor() + " * " + num2.getValor() + " = " + resultado);
    }

    //Método que divide los valores de dos objetos Numero y muestra la operación
    //(si se divide entre 0 captura la excepción y avisa del error)
    public static void dividir(Numero num1, Numero num2) {
        int resultado;

        try {
            resultado = num1.getValor() / num2.getValor();
            System.out.println(num1.getValor() + " / " + num2.getValor() + " = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error. No se puede dividir entre 0.");
        }
    }
    
    //Método que ejecuta la operación correspondiente a la opción elegida
    public static void ejecutarOpcion(int opcion, Numero num1, Numero num2) {
        switch (opcion) {
            case 1:
                sumar(num1, num2);
                break;
            case 2:
                restar(num1, num2);
                break;
            case 3:
                multiplicar(num1, num2);
                break;
            case 4:
                dividir(num1, num2);
                break;
            case 5:
                System.out.println("Fin del programa.");
                break;
            default:
                System.out.println("Opción no válida. Elija una opción entre 1 y 5.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        
        //Pedimos los dos números y creamos un objeto con cada uno
        Numero num1 = new Numero(pedirNumero(1));
        Numero num2 = new Numero(pedirNumero(2));

        //Mostramos el menú hasta que el usuario elija la opción 5
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            ejecutarOpcion(opcion, num1, num2);
        } while (opcion != 5);
    }
    
}
