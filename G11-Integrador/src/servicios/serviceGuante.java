/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Guante;


public class serviceGuante extends serviceDispositivos{
    
    public Guante crearGuante(){
        
        Guante guante = new Guante();
        
        float consumo = 4000;
        
        super.crearDispositivo(guante, consumo,"");
        
        return guante;
    }
}
