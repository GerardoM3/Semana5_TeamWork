
package Desarrollo;
//Importación de clases para la lectura desde teclado
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejemplo1_parte1 {
    public static void main(String[] args) {
        try{ //Objeto leer de la clase BufferedReader
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar la cantidad de su salario:");
            double salario = Double.parseDouble(leer.readLine());
            ifSencillo(salario);//Envia el valor de salario a aser evaluado al método
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void ifSencillo(double salario){
        if(salario > 235){//La condicio que se evalua y en caso de ser verdadera
            System.out.println("Usted gana mas del salario minimo");
        }
    }
    
}
