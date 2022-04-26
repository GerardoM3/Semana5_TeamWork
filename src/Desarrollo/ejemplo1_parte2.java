
package Desarrollo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejemplo1_parte2 {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un número límite de repetición");
            String limite = leer.readLine();
            if(limite == null){//Evalua si el valor String no está vacío
                System.out.println("Dato válido");
            }else{
                //Envío de parámetro al método correspondiente haciendo la conversión o casting de datos
                instruccionWhileSencillo(Integer.parseInt(limite));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void instruccionWhileSencillo(int valorLimite){
        int i = 1; //Valor inicial del contador
        while(i <= valorLimite){//Repetir mientras no se cumpla la condición
            System.out.println("El valor de la repetición es: " + i);
            i++;//Incremento de 1 por cada iteración
        }
    }
}
