
package Desarrollo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejemplo5_parte1 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingrese un número entre 1 y 5: ");
            int numero = Integer.parseInt(leer.readLine());
            switchInt(numero);
        }catch(Exception e){
             System.out.println(e.getMessage());    
        }
    }

    private static void switchInt(int numero) {
        String nombreDelNumero;
        switch(numero){
            case 1:
                nombreDelNumero = "UNO";
                break;
            case 2:
                nombreDelNumero = "DOS";
                break;
            case 3:
                nombreDelNumero = "TRES";
                break;
            case 4:
                nombreDelNumero = "CUATRO";
                break; 
            case 5:
                nombreDelNumero = "CINCO";
                break;  
            default:
                nombreDelNumero = "Número no válido!";
        }
        System.out.println("El número ingresado es: " + nombreDelNumero);
    }
    
}
