
package entidades;


public class Dispositivo {
    
    protected float consumo;
    protected boolean daniado;
    protected String nombre;

    public Dispositivo() {
    }

    public Dispositivo(float consumo, boolean daniado, String nombre) {
        this.consumo = consumo;
        this.daniado = daniado;
        this.nombre = nombre;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public boolean isDaniado() {
        return daniado;
    }

    public void setDaniado(boolean daniado) {
        this.daniado = daniado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + "{" + "consumo=" + consumo + ", daniado=" + daniado +'}';
    }

   

   
    
}
