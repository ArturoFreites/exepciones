/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Bota;


public class serviceBota extends serviceDispositivos{
    
    public Bota crearBota(){
       
        float consumo = 5000;
        Bota bota = new Bota();
        super.crearDispositivo(bota, consumo,"");
        return bota;
        
    }
    
    
    
}
