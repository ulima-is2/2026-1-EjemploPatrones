package pe.edu.ulima.is2.patrones.strategy;

public class ConTarjeta extends Pago{
    @Override
    public float calcularMontoAPagar(float monto) {
        return monto * 1.05f;
    }
}
