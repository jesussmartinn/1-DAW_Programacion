package tema05;


/**
 *
 * @author d3stroya
 */
public class Recursividad {
    
    public static int factorial(int num) {
        if(num == 0) {
            return 1;
        } else {
            System.out.println(num);
            return num * factorial(num - 1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 5;
        int resultado = factorial(num);
        System.out.println("El factorial de " + num + " es: " + resultado);
    }    

}
