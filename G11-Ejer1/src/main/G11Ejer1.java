
package main;

import entidades.Persona;

public class G11Ejer1 {

   
    public static void main(String[] args) {
       
        Persona persona = new Persona();
            
        try{
            System.out.println(persona.esMayordeEdad(persona));
            int num =4/0;
            
        }
        catch(NullPointerException e){
            System.out.println(e.toString());
        }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }
        
        System.out.println("que queres ver maxi?");
        System.out.println("Alguna duda?");
        
    }
    
}
