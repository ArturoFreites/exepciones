
package main;

import entidades.Armadura;
import servicios.serviceArmadura;
import servicios.serviceEstado;
import servicios.serviceMovimiento;




public class G11Integrador {

    public static void main(String[] args) 
    
    {
        serviceArmadura servArmadura = new serviceArmadura();
        serviceMovimiento servMovimiento = new serviceMovimiento();
        serviceEstado servEstado = new serviceEstado(); 
        
        System.out.println("HOLA - SOY EL PUTO JARVIS ");
        
        Armadura armadura1 = servArmadura.crearArmadura();
        armadura1.getDispositivos().get(0).setDaniado(true);
        
        System.out.println(armadura1.toString());
        
        servMovimiento.movimiento(armadura1);
        System.out.println(armadura1.toString());
        
        servEstado.mostrarEstado(armadura1);
        
        servMovimiento.movimiento(armadura1);
        System.out.println(armadura1.toString());
        

        
        
        
    }
    
}
