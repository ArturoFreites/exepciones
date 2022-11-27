
package servicios;

import entidades.Consola;


class serviceConsola extends serviceDispositivos{
    
    public Consola crearConsola(){
        
        String nombre = "CONSOLA";
        float consumo = 6000;
        
        Consola consola = new Consola();
        super.crearDispositivo(consola, consumo,nombre);
        
        return consola;
    }
    
}
