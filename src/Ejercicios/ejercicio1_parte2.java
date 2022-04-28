
package Ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ejercicio1_parte2 {
    public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el costo de la maquinaria");
            System.out.print("$");
            double costoM = Double.parseDouble(leer.readLine());
            System.out.println("Ingrese el nombre de la máquina");
            String nameM = leer.readLine();
            System.out.println("Ingrese el periodo de tiempo que será depreciada (años)");
            int anhiosM = Integer.parseInt(leer.readLine());
            
            DepreciacionMaquinaria(costoM, nameM, anhiosM);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public static void DepreciacionMaquinaria(double costoM, String nameM, int anhiosM){
        NumberFormat formato = new DecimalFormat("#.##");
        double sumaDigitos = (anhiosM*(anhiosM+1)) / 2;
        int anhio = 0;
        System.out.println("-------------------------------------- ");
        for (int i = anhiosM; i > 0; i--) {
            double Depreciacion = (i / sumaDigitos) * costoM;
            anhio++;
            System.out.println("Año: " + anhio);
            System.out.println("Nombre de la maquinaria: " + nameM);
            System.out.println("Porcentaje de depreciación: " + formato.format((i/sumaDigitos) * 100) + "%");
            System.out.println("Costo final de la máquina: " + Depreciacion);
            System.out.println("--------------------------------------");
            
        }
    }
    
}
