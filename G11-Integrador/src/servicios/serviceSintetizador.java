
package servicios;

import entidades.Sintetizador;


class serviceSintetizador extends serviceDispositivos{
   
    public Sintetizador crearSintetizador(){
        
        float consumo = 7000;
        
        Sintetizador sintetizador = new Sintetizador();
        
        super.crearDispositivo(sintetizador,consumo,"SINTETIZADOR");
        
        
        return sintetizador;
    }
    
}
