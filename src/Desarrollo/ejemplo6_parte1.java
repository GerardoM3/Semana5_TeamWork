
package Desarrollo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejemplo6_parte1 {
    public static void main(String[] args){
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar el género del vendedor: ");
            double valorVenta = Double.parseDouble(leer.readLine());
            System.out.println("Ingresar el género del vendedor: ");
            String genero = leer.readLine();
            
            calcularComision(valorVenta, genero.toUpperCase().charAt(0));
        }catch(Exception e){
             System.out.println(e.getMessage());   
            
        }
    }

    public static void calcularComision(double valorVenta, char generoVendedor) {
        double comision, salario = 0.0;
        String genero = "";
        if(generoVendedor == 'M'){
            genero = "Masculino";
            comision = valorVenta * 0.03;
            salario = comision + 200;
        }else if(generoVendedor == 'F'){
            genero = "Femenino";
            comision = valorVenta * 0.05;
            salario = comision + 200;
        }
        
        System.out.println("El salario del vendedor " + genero + "es de " +salario);
            
        
    }
}
