package pe.edu.ulima.is2.patrones.command;

public class OrdenSubrayar implements Orden{
    @Override
    public void ejecutar() {
        System.out.println("Se ejecuta Orden Subrayar");
    }

    @Override
    public void deshacer() {
        System.out.println("Se ejecuta Deshace ORden Subrayar");
    }
}
