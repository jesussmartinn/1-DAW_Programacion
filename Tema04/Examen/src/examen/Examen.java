/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author User
 */
public class Examen {

    /**
     * Creo un Scanner global para todo el ejercicio
     */
    static Scanner entrada = new Scanner(System.in);

    public static int pedirOpcion() {
        int opcion;

        System.out.println("Introduzca una opcion: ");
        opcion = entrada.nextInt();

        return opcion;
    }

    /**
     * Método que pide el número de visitantes al usuario para que lo introduzca
     * por teclado.
     *
     * @return
     */
    public static int numVisitantes() {
        int visitantesTotales;

        System.out.println("Introduzca el número de visitantes totales: ");
        visitantesTotales = entrada.nextInt();

        return visitantesTotales;
    }

    /**
     * Método que según la cantidad de visitantes que introduzca el usuario,
     * divide los grupos en un divisor exacto para que no sobre ningun
     * visitante.
     *
     * @return
     */
    public static int dividirGrupos() {
        int visitantes;
        int grupos = 0;
        Boolean enc = false;

        visitantes = numVisitantes();

        for (int i = 2; i < visitantes; i++) {
            if (visitantes % i == 0) {
                enc = true;
                grupos = i;
            }
        }

        if (!enc) {
            System.out.println("No se puede hacer un grupo exacto con este número");
        } else {
            System.out.println("La cantidad de grupos formados para " + visitantes + " personas es: " + grupos + " grupos");
        }

        return grupos;
    }

    public static int pedirEspera(String mensaje) {
        int tiempo;

        System.out.println(mensaje);
        tiempo = entrada.nextInt();

        return tiempo;
    }

    /**
     * Método que según el tiempo de espera que introduzca el usuario, lo
     * devuelve ordenado de menor a mayor
     *
     * @param mensaje
     */
    public static void ordenDeEspera(String mensaje) {
        int tiempo1 = pedirEspera("Introduzca el tiempo de espera en la primera atracción: ");
        int tiempo2 = pedirEspera("Introduzca el tiempo de espera en la segunda atracción: ");
        int tiempo3 = pedirEspera("Introduzca el tiempo de espera en la tercer atracción: ");

        if(tiempo1 < tiempo2 && tiempo1 < tiempo3){
            System.out.println(tiempo1);
        }else if(tiempo2 < tiempo1 && tiempo2 < tiempo3){
            System.out.println(tiempo2);
        }else{
            System.out.println(tiempo3);
        }
        
        if(tiempo1 < tiempo3 && tiempo1 < tiempo2){
            System.out.println(tiempo1);
        }else if(tiempo2 < tiempo3){
            System.out.println(tiempo2);
        }
    }

    /**
     * Método que pide al usuario que introduzca el radio del nuevo tiovivo por
     * teclado.
     *
     * @param
     * @return
     */
    public static double pedirRadio() {
        double radio;

        System.out.println("Introduzca el radio del nuevo tiovivo: ");
        radio = entrada.nextDouble();

        return radio;
    }

    /**
     * Método que realiza la operación para conseguir la superficie del nuevo
     * tiovivo según el radio que introduce el usuario por teclado.
     *
     * @param radio
     * @return
     */
    public static double superficieTiovivo(double radio) {
        radio = pedirRadio();

        double superficie = (Math.PI) * (Math.pow(radio, 2.0));

        return superficie;
    }

    /**
     * Método que muestra por pantalla el menú
     */
    public static void mostrarMenu() {
        System.out.println("-----Parque de atracciones-----");
        System.out.println("1- Grupos para las atracciones.");
        System.out.println("2- Tiempos de espera de 3 atracciones.");
        System.out.println("3- Cálculo del área del nuevo tiovivo.");
        System.out.println("4- Salir.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        String mensaje = " ";
        double radio = 0.0;
        double superficie = 0.0;

        do {
            try {
                mostrarMenu();
                opcion = pedirOpcion();

                switch (opcion) {
                    case 1:
                        dividirGrupos();
                        break;
                    case 2:
                        ordenDeEspera(mensaje);
                        break;
                    case 3:
                        superficieTiovivo(radio);
                        System.out.println("La superficie calculada para el nuevo tiovivo es: "
                                + superficie);
                        break;
                    case 4:
                        System.out.println("Gracias por visitarnos.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: has introducido un valor incorrecto.");
                entrada.nextLine();
            }
        } while (opcion != 4);
    }
}

