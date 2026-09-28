/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema02_ejercicio04;

/**
 *
 * @author alumno
 */
public class Tema02_Ejercicio04 {
    final static int NUMEXAMENES = 2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota1 = 10;
        float nota2 = 9f;
        float media;
        media = (nota1 + nota2)/NUMEXAMENES;
        System.out.println("La asignatura se llama Programación");
        System.out.println("La nota del primer examen es " + nota1);
        System.out.println("La nota del segundo examen es " + nota2);
        System.out.println("La nota media es " + media);
    }
    
}
