
package entidades;

import enums.Colores;
import java.util.ArrayList;


public class Armadura {
    private String material;
    private Colores colorPrimario;
    private Colores colorSecundario;
    private Integer resistencia;
    private Integer salud;
    private Float bateria;
    private ArrayList<Dispositivo> dispositivos;  
    private ArrayList<ObjetoRadar> objetosRadar;  
    
    public Armadura() {
    }

    public Armadura(String material, Colores colorPrimario, Colores colorSecundario, Integer resistencia, Integer salud, Float bateria, ArrayList<Dispositivo> dispositivos, ArrayList<ObjetoRadar> objetosRadar) {
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.resistencia = resistencia;
        this.salud = salud;
        this.bateria = bateria;
        this.dispositivos = dispositivos;
        this.objetosRadar = objetosRadar;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Colores getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(Colores colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public Colores getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(Colores colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Float getBateria() {
        return bateria;
    }

    public void setBateria(Float bateria) {
        this.bateria = bateria;
    }

    public ArrayList<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(ArrayList<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public ArrayList<ObjetoRadar> getObjetosRadar() {
        return objetosRadar;
    }

    public void setObjetosRadar(ArrayList<ObjetoRadar> objetosRadar) {
        this.objetosRadar = objetosRadar;
    }

    @Override
    public String toString() {
        return "Armadura{" + "material=" + material + ", colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + ", resistencia=" + resistencia + ", salud=" + salud + ", bateria=" + bateria + ", dispositivos=" + dispositivos + ", objetosRadar=" + objetosRadar + '}';
    }

    
    
    
    
}

