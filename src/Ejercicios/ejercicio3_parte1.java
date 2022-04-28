
package Ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ejercicio3_parte1 {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Cálculo del Índice de Masa Corporal (IMC)");
            System.out.println();
            System.out.println("Ingrese su peso en kg");
            double peso = Double.parseDouble(leer.readLine());
            System.out.println("Ingrese su estatura en m (metros)");
            double estatura = Double.parseDouble(leer.readLine());
            
            IMC(peso, estatura);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    public static void IMC(double peso, double estatura){
        double resultado;
        resultado = peso / (estatura * estatura);
        NumberFormat formato = new DecimalFormat("#.##");
        if(resultado <= 18){
            System.out.println("------------------------");
            System.out.println("Índice de Masa Corporal (IMC) -> " + formato.format(resultado));
            System.out.println("Clasificación");
            System.out.println("Peso bajo. Necesario valorar signos de desnutrición.");
            System.out.println("------------------------");
        }else if((resultado > 18) && (resultado < 25)){
            System.out.println("------------------------");
            System.out.println("Índice de Masa Corporal (IMC) -> " + formato.format(resultado));
            System.out.println("Clasificación");
            System.out.println("NORMAL");
            System.out.println("------------------------");
        }else if((resultado >=25) && (resultado < 27)){
            System.out.println("------------------------");
            System.out.println("Índice de Masa Corporal (IMC) -> " + formato.format(resultado));
            System.out.println("Clasificación");
            System.out.println("Sobrepeso");
            System.out.println("------------------------");
        }else if(resultado >= 27){
            System.out.println("------------------------");
            System.out.println("Índice de Masa Corporal (IMC) -> " + formato.format(resultado));
            System.out.println("Clasificación");
            System.out.println("Obesidad");
            if(resultado < 30){
                System.out.println("Obesidad grado I: Riesgo relativo ALTO para desarrollar enfermedades cardiovasculares.");
                System.out.println("------------------------");
            }else if((resultado >= 30) && (resultado < 40)){
                System.out.println("Obesidad grado II: Riesgo relativo MUY ALTO para el desarrollo enfermedades cardiovasculares.");
                System.out.println("------------------------");
            }else if(resultado >= 40){
                System.out.println("Obesidad grado III (Extrema o Mórbida): Riesgo relativo EXTREMADAMENTE ALTO para el desarrollo de enfermedades cardiovasculares.");
                System.out.println("------------------------");
            }
        }
    }
}
