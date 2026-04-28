package pe.edu.ulima.is2.patrones.factory_method;

public class ProcesadorTexto extends Aplicacion{
    @Override
    public Documento crear() {
        return new Doc();
    }
}
