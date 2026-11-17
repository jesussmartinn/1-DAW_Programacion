/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05_ejercicio03;

/**
 *
 * @author User
 */
public class Rueda {
    //ATRIBUTOS
    private String material;
    private int pulgadas;
    
    //MÉTODOS GETTERS Y SETTERS
    
    public void setMaterial(String m){
        material = m;
    }
    
    public void setPulgadas(int p){
        pulgadas = p;
    }
    
    public String getMaterial(){
        return material;
    }
    
    public int getPulgadas(){
        return pulgadas;
    }
    
    //Mostrar con toString()
    @Override
    public String toString(){
        return "Material: " + material 
                + ", Pulgadas: " + pulgadas;
    }
}
