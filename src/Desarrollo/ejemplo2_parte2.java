
package Desarrollo;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejemplo2_parte2 {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número límite de repetición: ");
            String limite = leer.readLine();
            //Casting o conversión de datos al momento de envío
            instruccionFor(Integer.parseInt(limite));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void instruccionFor(int valorLimite){
        //for(valor inicial; valor final; incremento)
        for (int i = 1; i <= valorLimite; i++) {
            System.out.println("El valor de la repetición es: " + i);
        }
    }
}
