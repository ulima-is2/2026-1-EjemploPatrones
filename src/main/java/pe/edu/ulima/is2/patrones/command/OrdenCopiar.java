package pe.edu.ulima.is2.patrones.command;

public class OrdenCopiar implements Orden{
    @Override
    public void ejecutar() {
        System.out.println("Se ejecuta Orden Copiar");
    }

    @Override
    public void deshacer() {
        System.out.println("Se ejecuta Deshace ORden Copiar");
    }
}
