
package Desarrollo;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejemplo2_parte1 {
    public static void main(String[] args) {
        try{ //Objeto leer de la clase BufferedReader
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar la cantidad de su salario:");
            double salario = Double.parseDouble(leer.readLine());
            ifElse(salario); //Envia el valor de salario a aser evaluado al método
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void ifElse(double salario){
        if(salario > 235){ //La condicio que se evalua y en caso de ser verdadera
            System.out.println("Usted gana mas del salario minimo");
        }else{ //En caso que la condicion anterior no se cumpla se ejecuta lo siguiente
            System.out.println("Usted gana menos del salario minimo");
        }
    }
}
    

