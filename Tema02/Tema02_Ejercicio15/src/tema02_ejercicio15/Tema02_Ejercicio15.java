/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema02_ejercicio15;

/**
 *
 * @author alumno
 */
public class Tema02_Ejercicio15 {
    static int tiempo = 10000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;
        
        
        horas = tiempo / 3600;
        
        minutos = (tiempo % 3600) / 60;
        
        segundos = minutos % 60;
        
        System.out.println("10000 segundos hacen un total de: " + horas + 
                " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
    
}
