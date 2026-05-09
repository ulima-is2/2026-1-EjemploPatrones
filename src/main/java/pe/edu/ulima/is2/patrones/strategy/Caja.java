package pe.edu.ulima.is2.patrones.strategy;

public class Caja {
    private Pago pago;
    private float montoAPagar;

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public void registrarMontoAPagar(float monto) {
        montoAPagar = monto;
    }

    public void imprimirCuenta() {
        System.out.println(
                "Monto a Pagar es: " + pago.calcularMontoAPagar(montoAPagar)
        );
    }
}
