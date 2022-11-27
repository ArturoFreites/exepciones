     
package servicios;

import entidades.Dispositivo;
import java.util.Scanner;


public class serviceDispositivos {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void crearDispositivo(Dispositivo dispositivo,float consumo, String nombre){
        
        dispositivo.setConsumo(consumo);
        dispositivo.setDaniado(false);
        dispositivo.setNombre(nombre);
    }
        
}
