package pe.edu.ulima.is2.patrones.factory_method;

public class Ppt extends Documento{
    @Override
    public void abrir() {
        System.out.println("Se abrira documento de Powerpoint");
    }

    @Override
    public void cerrar() {
        System.out.println("Se cerrar documento de Powerpoint");
    }
}
