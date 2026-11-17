/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio01;

/**
 *
 * @author User
 */
public class Tema05_Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo los dos coches
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();
        
        //Atributos de mi coche:
        miCoche.setMarca("Audi");
        miCoche.setModelo("RS3");
        miCoche.setColor("Negro");
        
        //Atributos del coche de mi padre:
        cochePadre.setMarca("BMW");
        cochePadre.setModelo("X1");
        cochePadre.setColor("Blanco");
        
        //ESTADO ANTES DE LAS OPERACIONES
        System.out.println("Estado de ambos coches antes de las operaciones: ");
        miCoche.obtenerEstado();
        cochePadre.obtenerEstado();
        
        //Operaciones
        miCoche.acelerarCoche(5);
        miCoche.frenarCoche(2);
        cochePadre.acelerarCoche(3);
        cochePadre.apagarCoche(Boolean.TRUE, 0);
        
        //ESTADO DESPUES DE LAS OPERACIONES
        System.out.println("Estado de ambos coches después de las operaciones: ");
        miCoche.obtenerEstado();
        cochePadre.obtenerEstado();
    } 
    
}
