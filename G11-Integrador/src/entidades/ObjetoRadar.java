
package entidades;


public class ObjetoRadar {
    
    private Integer coordenadas;
    private String nombre;
    private boolean hostil;
    private Integer resistencia;
    private Double distancia;

    
    public ObjetoRadar() {
        
    }
    
    public ObjetoRadar(Integer coordenadas, String nombre, boolean hostil, Integer resistencia, Double distancia) {
        this.coordenadas = coordenadas;
        this.nombre = nombre;
        this.hostil = hostil;
        this.resistencia = resistencia;
        this.distancia = distancia;
    }

    public Integer getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Integer coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return nombre + "{" + "coordenadas=" + coordenadas +", hostil=" + hostil + ", resistencia=" + resistencia + ", distancia=" + distancia + '}';
    }
    
    
    
}
