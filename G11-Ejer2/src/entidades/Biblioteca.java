
package entidades;

public class Biblioteca {
    
    private String libros[] = new String[4];

    public Biblioteca() {
    }

    public String[] getLibros() {
        return libros;
    }

    public void setLibros(String[] libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "libros=" + libros + '}';
    }
    
    public void llenarBiblioteca(Biblioteca biblioteca){
        
        String libro;
        for (int i = 0; i < biblioteca.getLibros().length; i++)
        {
            libro = "libro "+i;
            biblioteca.getLibros() [i] = libro;
        }
    }
}
