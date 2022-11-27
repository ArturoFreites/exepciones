
package entidades;


public class Persona {

    private String nombre;
    private Integer edad;

    public Persona() {
    }

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
    public boolean esMayordeEdad(Persona persona){
        
        return persona.getEdad()>18;
        
    } 
    
    public String tieneNombre(Persona persona){
        
        return persona.getNombre().toUpperCase();
        
    }
    
}
