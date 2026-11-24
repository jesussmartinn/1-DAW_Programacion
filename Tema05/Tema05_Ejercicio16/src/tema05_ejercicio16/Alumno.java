/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05_ejercicio16;

/**
 *
 * @author User
 */
public class Alumno {
    //ATRIBUTOS
    private String nombre;
    private int nota;

    //CONSTRUCTORES
    //Constructor por defecto
    public Alumno() {
        this.nombre = "";
        this.nota = 0;
    }

    //Constructor parametrizado
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    //Mostrar con toString()
    @Override
    public String toString(){
        return nombre + " ha sacado un " + nota;
    }
}
