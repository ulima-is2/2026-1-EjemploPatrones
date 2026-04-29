package pe.edu.ulima.is2.patrones.fachada;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    static void main() {
        List<Item> itemsAComprar = new ArrayList<>();
        itemsAComprar.add(new Item("PS5", 1, 500f));
        itemsAComprar.add(new Item("PS5", 1, 500f));
        itemsAComprar.add(new Item("PS5", 1, 500f));
        itemsAComprar.add(new Item("PS5", 1, 500f));
        itemsAComprar.add(new Item("PS5", 1, 500f));
        itemsAComprar.add(new Item("PS5", 1, 500f));
        itemsAComprar.add(new Item("PS5", 1, 500f));
        itemsAComprar.add(new Item("PS5", 1, 500f));
        itemsAComprar.add(new Item("PS5", 1, 500f));
        itemsAComprar.add(new Item("PS5", 1, 500f));

        comprar(itemsAComprar);

        comprar(itemsAComprar);
    }

    public static void comprar(List<Item> items) {
        VentasManager manager = VentasManager.getInstance();

        if (!manager.validarStock(items)) {
            return;
        }

        float desc = manager.calcularDescuento(items);
        float costoShipping = manager.calcularCostoShipping(items);


    }


}
