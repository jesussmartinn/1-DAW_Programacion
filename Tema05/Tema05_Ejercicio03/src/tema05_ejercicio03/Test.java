/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio03;

/**
 *
 * @author User
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cremos dos objetos de la clase Rueda
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();
        
        //Establecemos el material y las pulgadas de ambas ruedas
        rueda1.setMaterial("Goma");
        rueda1.setPulgadas(7);
        
        rueda2.setMaterial("Caucho");
        rueda2.setPulgadas(8);
        
        //Creo 3 objetos de la clase coche
        Coche coche1 = new Coche();
        Coche coche2= new Coche();
        Coche coche3 = new Coche();
        
        //Establecemos la marca y el modelo de los 3 coches
       
        //Coche 1
        coche1.setMarca("Audi");
        coche1.setModelo("RS3");
        coche1.setRueda(rueda1);
        
        //Coche 2
        coche2.setMarca("Seat");
        coche2.setModelo("León");
        coche2.setRueda(rueda1);
        
        //Coche 3
        coche3.setMarca("BMW");
        coche3.setModelo("X3");
        coche3.setRueda(rueda2);
        
        //Muestro los datos de los coches creados:
        coche1.mostrarCoche();
        coche2.mostrarCoche();
        coche3.mostrarCoche();
    }
    
}
