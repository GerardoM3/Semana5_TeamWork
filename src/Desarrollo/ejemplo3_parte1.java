
package Desarrollo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejemplo3_parte1 {
    public static void main(String[] args) {
        try{ //Objeto leer de la clase BufferedReader
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar la cantidad de su salario:");
            double salario = Double.parseDouble(leer.readLine());
            ifElseAnidada(salario); //Envia el valor de salario a aser evaluado al método
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void ifElseAnidada(double salario){
        if(salario > 235){ //La condición que se evalua y en caso de ser verdadera
            System.out.println("Usted gana mas del salario minimo");
        }else if(salario > 0) { //Si la condicion anterior no se cumple evalua la siguiente
            System.out.println("Usted gana menos del salario minimo");
        }else{//En caso que la condicion anterior no se cumpla se ejecuta lo siguiente
            System.out.println("Ingrso de dato erroneo:");
        } 
    }
}
    
    
