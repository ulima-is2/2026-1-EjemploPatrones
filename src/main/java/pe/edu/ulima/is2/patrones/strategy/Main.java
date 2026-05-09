package pe.edu.ulima.is2.patrones.strategy;

public class Main {
    static void main() {
        Caja caja = new Caja();
        caja.setPago(new Contado());
        caja.registrarMontoAPagar(100f);
        caja.imprimirCuenta();

        caja.registrarMontoAPagar(500f);
        caja.setPago(new ConTarjeta());
        caja.imprimirCuenta();
    }

}
