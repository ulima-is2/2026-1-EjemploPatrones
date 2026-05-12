package pe.edu.ulima.is2.patrones.command;

import java.util.Optional;

public class Cliente {
    static void main() {
        Orden ordenCopiar = new OrdenCopiar();
        Orden ordenSubrayar = new OrdenSubrayar();
        Orden ordenPegar = new OrdenPegar();

        ComandosManager.getInstance().agregarOrden(ordenCopiar);
        ComandosManager.getInstance().agregarOrden(ordenPegar);
        ComandosManager.getInstance().agregarOrden(ordenCopiar);
        ComandosManager.getInstance().agregarOrden(ordenSubrayar);

        while (true) {
            Optional<Orden> o = ComandosManager.getInstance().obtenerOrden();
            if (o.isEmpty()) {
                break;
            }
            o.get().ejecutar();
        }
    }
}
