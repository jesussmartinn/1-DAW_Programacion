/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicioguiado;

/**
 *
 * @author User
 */
public class Tema05_EjercicioGuiado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear dos bicicletas
        Bicicleta bici1 = new Bicicleta();
        Bicicleta bici2 = new Bicicleta();
        
        //Atributos Bici 1:
        bici1.setMarca("Orbea");
        bici1.setColor("Rojo");
        bici1.setPrecio(100f);
        bici1.setAnios(5);
        
        //Incrementar contador de bicis en 1
        Bicicleta.aumentarContadorBicicletas();
        
        //Atributos Bici 2:
        bici2.setMarca("Mérida");
        bici2.setColor("Azul");
        bici2.setPrecio(500f);
        bici2.setAnios(15);
        
        //Incrementar contador de bicis en 1
        Bicicleta.aumentarContadorBicicletas();
        
        //Mostrar bici1 (mostrar)
        bici1.mostrarBicicleta();
        
        //Mostrar bici2 (toString())
        System.out.println(bici2.toString());
        /**
         * Otra forma de hacerlo:
         * String resultado = bici2.toString();
         * System.out.println(resultado);
         */
        
        //Mostrar color bici1
        System.out.println("Color de bici 1: " + bici1.getColor());
        
        //Mostrar contador de bicicletas
        System.out.println("Contador de bicicletas: " + 
                Bicicleta.getContadorBicicletas());
    }
}
