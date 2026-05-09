package pe.edu.ulima.is2.patrones.strategy;

public class ConCupon extends Pago{
    @Override
    public float calcularMontoAPagar(float monto) {
        return monto - 0.1f * monto;
    }
}
