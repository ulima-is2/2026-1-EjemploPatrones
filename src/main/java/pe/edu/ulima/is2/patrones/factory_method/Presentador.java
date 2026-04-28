package pe.edu.ulima.is2.patrones.factory_method;

public class Presentador extends Aplicacion{
    @Override
    public Documento crear() {
        return new Ppt();
    }
}
