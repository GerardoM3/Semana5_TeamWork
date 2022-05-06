/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;

/**
 *
 * @author penaf
 */
public class ejercicio1_parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        boolean salir = false;
        int opcion;
        
        while (!salir) {
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            
           
                System.out.println("Seleccione una opcion");
                opcion = leer.nextInt();
                
                switch (opcion) {//se inicia la impresion
                    
                    case 1:
                        double numero1, numero2, suma;
                        System.out.println("Ingrese el primer numero");  
                        numero1 = leer.nextDouble();
                        System.out.println("Ingrese el segundo numero"); 
                        numero2 = leer.nextDouble();
                        suma = numero1 + numero2;
                        System.out.println("El resultado de la suma es: " +suma);
                        break;
                        
                    case 2:
                        System.out.println("Ha seleccionado Resta2");
                        double Resta1, Resta2, resta;
                        System.out.println("Ingrese el primer numero");  
                         Resta1 = leer.nextDouble();
                         System.out.println("Ingrese el segundo numero"); 
                         Resta2 = leer.nextDouble();
                         resta = Resta1 - Resta2;
                         System.out.println("El resultado de la Resta es: " +resta);
                         break;
                        
                    case 3:
                        System.out.println("Ha seleccionado la Multiplicacion");
                        double Mult1, Mult2, multiplicacion;
                        System.out.println("Ingrese el primer numero");  
                         Mult1 = leer.nextDouble();
                         System.out.println("Ingrese el segundo numero"); 
                         Mult2 = leer.nextDouble();
                         multiplicacion = Mult1 * Mult2;
                         System.out.println("El resultado de la Multiplicacion es: " +multiplicacion);
                         break;
                    
                    case 4:
                         System.out.println("Ha seleccionado la Division");
                         double Div1, Div2, division;
                         System.out.println("Ingrese el primer numero");  
                         Div1 = leer.nextDouble();
                         System.out.println("Ingrese el segundo numero"); 
                         Div2 = leer.nextDouble();
                         division = Div1 / Div2;
                         System.out.println("El resultado de la Division es: " +division);
                         break;
                }
            }
        }
        
    }
    

