/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05_ejercicio14;

/**
 *
 * @author User
 */
public class Numero {
    //ATRIBUTOS
    private int valor;
    
    //CONSTRUCTORES
    
    //Constructor por defecto
    public Numero(){
        this.valor = 0;
    }
    
    //Constructor parametrizado
    public Numero(int valor){
        this.valor = valor;
    }
    
    //GETTERS Y SETTERS
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
}
