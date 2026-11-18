/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio01;

/**
 *
 * @author User
 */
public class Test {

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
          
        //Operaciones
        System.out.println("---OPERACIONES---");
        //Esto se debe hacer con el for, no asignarle un 5.
        miCoche.acelerarCoche(5);
        miCoche.frenarCoche(2);
        cochePadre.acelerarCoche(3);
        cochePadre.apagarCoche(Boolean.TRUE, 0);
        
        //ESTADO DE AMBOS COCHES
        System.out.println("---ESTADO DE AMBOS COCHES---");
        miCoche.obtenerEstado();
        cochePadre.obtenerEstado();
    } 
    
}
