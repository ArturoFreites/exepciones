/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;


public enum Materiales {
    METAL("Metal",1000),CARBONO("CARBONO",2000),ADAMANTIUM("ADAMANTIUM",3000);
    
    private String material;
    private int resistencia;

    private Materiales() {
    }

    private Materiales(String material, int resistencia) {
        this.material = material;
        this.resistencia = resistencia;
    }

    public static Materiales getMETAL() {
        return METAL;
    }

    public static Materiales getCARBONO() {
        return CARBONO;
    }

    public static Materiales getADAMANTIUM() {
        return ADAMANTIUM;
    }

    public String getMaterial() {
        return material;
    }

    public int getResistencia() {
        return resistencia;
    }
    
    

    
    
    
}
