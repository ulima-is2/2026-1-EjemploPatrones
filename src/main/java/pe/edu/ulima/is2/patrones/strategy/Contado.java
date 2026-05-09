package pe.edu.ulima.is2.patrones.strategy;

public class Contado extends Pago{
    @Override
    public float calcularMontoAPagar(float monto) {
        return monto;
    }
}
