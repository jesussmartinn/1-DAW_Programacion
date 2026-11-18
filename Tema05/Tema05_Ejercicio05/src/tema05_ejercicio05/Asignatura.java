/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05_ejercicio05;

/**
 *
 * @author admin
 */
public class Asignatura {
    //ATRIBUTOS
    private String nombre;
    private double nota;
    
    //CONSTRUCTORES
    
    //Constructor por defecto
    public Asignatura(){
        this.nombre = "";
        this.nota = 0.0;
    }
    //Constructor parametrizado: asignoel nombre al crear el objeto
    public Asignatura(String nombre){
        this.nombre = nombre;
    }
    
    //GETTERS Y SETTERS
    public String getNombre(){
        return nombre;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    //Método que devuelve la nota de la asignatura
    public double getNota(){
        return nota;
    }
}
