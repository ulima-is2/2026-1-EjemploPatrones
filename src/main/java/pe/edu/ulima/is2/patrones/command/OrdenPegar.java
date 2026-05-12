package pe.edu.ulima.is2.patrones.command;

public class OrdenPegar implements Orden{
    @Override
    public void ejecutar() {
        System.out.println("Se ejecuta Orden Pegar");
    }

    @Override
    public void deshacer() {
        System.out.println("Se ejecuta Deshace ORden Pegar");
    }
}
