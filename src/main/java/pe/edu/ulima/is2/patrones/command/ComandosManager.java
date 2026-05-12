package pe.edu.ulima.is2.patrones.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComandosManager {
    private static ComandosManager instance =null;

    public static ComandosManager getInstance() {
        if (instance == null) {
            instance = new ComandosManager();
        }
        return instance;
    }

    private List<Orden> colaOrdenes;

    private ComandosManager() {}

    public void agregarOrden(Orden orden) {
        if (colaOrdenes == null) {
            colaOrdenes = new ArrayList<>();
        }
        colaOrdenes.add(orden);
    }

    public Optional<Orden> obtenerOrden(){
        if (colaOrdenes.size() > 0){
            Orden o = colaOrdenes.remove(0);
            return Optional.of(o);
        }
        return Optional.empty();
    }

}
