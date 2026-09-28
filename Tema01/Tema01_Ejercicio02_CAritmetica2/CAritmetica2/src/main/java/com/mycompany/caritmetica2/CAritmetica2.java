
package com.mycompany.caritmetica2;

/**
 *
 * @author User
 */
public class CAritmetica2 {

    public static void main(String[] args) {
        int dato1; //Declaro la variable entera dato1
        int dato2, resultado; //Declaro, a la vez, dos variables enteras: dato 2 y resultado
        int dato3;
        
        dato1 = 20; 
        dato2 = 10;
        dato3 = 2;
        
        //SUMA
        resultado = dato1 + dato2 + dato3;
        System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado);
        
        //RESTA
        resultado = dato1 - dato2 - dato3; 
        System.out.println(dato1 + " - " + dato2 + " - " + dato3 + " = " + resultado);
        
        //PRODUCTO
        resultado = dato1 * dato2 * dato3; 
        System.out.println(dato1 + " * " + dato2 + " * " + dato3 + " = " + resultado);
        
        //COCIENTE
        resultado = dato1 / dato2 / dato3; 
        System.out.println(dato1 + " / " + dato2 + " / " + dato3 + " = " + resultado);
    }
}
