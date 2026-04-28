package pe.edu.ulima.is2.patrones.singleton;

// SIngleton
public class Persona {
    private static Persona instance = null;

    private String nombre;
    private int edad;

    public static Persona getInstance() {
        if (instance == null) {
            instance = new Persona();
        }
        return instance;
    }

    private Persona() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
