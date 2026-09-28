
package com.mycompany.caritmetica;

/**
 *
 * @author User
 */
public class CAritmetica {

    public static void main(String[] args) {
        int dato1; //Declaro la variable entera dato1
        int dato2, resultado; //Declaro, a la vez, dos variables enteras: dato 2 y resultado
        
        dato1 = 20; 
        dato2 = 10;
        //SUMA
        resultado = dato1 + dato2; //Guardo la suma de las dos variables en resultado
        System.out.println(dato1 + " + " + dato2 + " = " + resultado); /*El método print ln escribe
                por pantalla tanto el valor de las variables así como las cadenas que están entre
                comillas. Para unir los 5 elementos se ha utilizado el operador " + ". */
        
        //RESTA
        resultado = dato1 - dato2; 
        System.out.println(dato1 + " - " + dato2 + " = " + resultado);
        
        //PRODUCTO
        resultado = dato1 * dato2; 
        System.out.println(dato1 + " * " + dato2 + " = " + resultado);
        
        //COCIENTE
        resultado = dato1 / dato2; 
        System.out.println(dato1 + " / " + dato2 + " = " + resultado);
    }
}
