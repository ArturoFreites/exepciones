
package entidades;


public class Juego {
    
    private Integer numAdivinar;
    private Integer numIntentos;

    public Juego() {
    }

    public Juego(Integer numAdivinar, Integer numIntentos) {
        this.numAdivinar = numAdivinar;
        this.numIntentos = numIntentos;
    }

    public Integer getNumAdivinar() {
        return numAdivinar;
    }

    public void setNumAdivinar(Integer numAdivinar) {
        this.numAdivinar = numAdivinar;
    }

    public Integer getNumIntentos() {
        return numIntentos;
    }

    public void setNumIntentos(Integer numIntentos) {
        this.numIntentos = numIntentos;
    }
    
    
}

