package main;

import entidad.DivisionNumero;
import java.util.Scanner;


public class G11Ejer3 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        DivisionNumero divNumero = new DivisionNumero();
        
        System.out.println("Ingrese num1");
        String num1 = read.next();
        System.out.println("Ingrese num2");
        String num2 = read.next();
        
        try{
            divNumero.setNum1(Integer.parseInt(num1));
            divNumero.setNum2(Integer.parseInt(num2)); 
            
        }catch(NumberFormatException e){
            System.out.println("No se pudo parcear el String!");
        }
        
        try{
            System.out.println(divNumero.getNum1()/divNumero.getNum2());
        }catch(NullPointerException e){
            System.out.println("No ingreso ningun numero!");
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por 0!");
        }
        
    }
    
}
