package pe.edu.ulima.is2.patrones.fachada;

import java.util.List;

public class VentasManager {
    private static VentasManager instance = null;

    private Inventario inventario;
    private Descuento descuento;
    private Shipping shipping;

    private VentasManager() {
        descuento = new Descuento();
        shipping = new Shipping();
        inventario = new Inventario();

        inventario.addItem(new Item("PS5", 12, 500f));
        inventario.addItem(new Item("Switch 2", 20, 400f));
    }

    public static VentasManager getInstance() {
        if (instance == null) {
            instance = new VentasManager();
        }

        return  instance;
    }

    public boolean validarStock(List<Item> items) {
        for (Item i : items){
            if (!inventario.existeItem(i)) {
                return false;
            }
        }
        return true;
    }

    public float calcularDescuento(List<Item> items) {
        return descuento.aplicarDescuento(items);
    }

    public float calcularCostoShipping(List<Item> items){
        return shipping.calcularShipping(items);
    }
}
