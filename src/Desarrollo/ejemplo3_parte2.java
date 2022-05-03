
package Desarrollo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejemplo3_parte2 {
    


    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar un número limite de repetición: ");
            String limite = leer.readLine();
            //Casting o conversion de base al momento de envio
            instruccionDoWhile(Integer.parseInt(limite));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void instruccionDoWhile(int valorLimite){
        int i = 1; //Valor inicial del contador
        do{ //Realiza por lo menos una vez la acción 
            System.out.println("El valor de la repetición es: " + i);
            i++; //Incremento del contador
        }while( i <=valorLimite); //Evalua la condición antes de volver a repetir
    }
}

