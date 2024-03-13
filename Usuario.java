import java.util.*;
class Usuario {
    private String nombre;
    private int id;
    
    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getId() {
        return id;
    }
}