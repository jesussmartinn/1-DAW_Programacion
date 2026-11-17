/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05_ejercicio03;

/**
 *
 * @author User
 */
public class Coche {
    //ATRIBUTOS
    private String marca;
    private String modelo;
    private Rueda rueda;
    
    //MÉTODOS GETTERS Y SETTERS
    
    public void setMarca(String m){
        marca = m;
    }
    
    public void setModelo(String md){
        modelo = md;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setRueda(Rueda r){
        rueda = r;
    }
    
    public Rueda getRueda(){
        return rueda;
    }

    //Método mostrar
    public void mostrarCoche(){
        System.out.println("Marca: " + marca + " - Modelo: " + modelo + 
                " - Rueda: " + rueda.toString());
    }
}
