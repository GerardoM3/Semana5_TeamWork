
package Desarrollo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejemplo4_parte1 {
    public static void main(String [] args) throws IOException {
      try{
          BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
          System.out.println("Ingrese el estado civil de la persona");
          String estadoCivil = leer.readLine();
          
          switchChar(estadoCivil.toUpperCase().charAt(0));
      }catch(Exception e){
          System.out.println(e.getMessage());    
      }  
    }

    public static void switchChar(char estadoCivil) {
        String mensajeEstadoCivil;
        switch(estadoCivil){
            case 'S':
                mensajeEstadoCivil = "Soltero/a";
                break;
            case 'C':
                mensajeEstadoCivil = "Casado/a";
                break;
            case 'D': 
                mensajeEstadoCivil = "Divorciado/a";
                break;
            case 'A':
                 mensajeEstadoCivil = "Acompañado/a";
                break;
            case 'F':
                mensajeEstadoCivil = "Forever Alone";
                break;
            default: 
                 mensajeEstadoCivil = "Estado civil erroneo";
                            
        }
        System.out.println("Su estado civil es: " + mensajeEstadoCivil); 
    }
            
}
