package pe.edu.ulima.is2.patrones.command;

public interface Orden {
    public void ejecutar();
    public void deshacer();
}
