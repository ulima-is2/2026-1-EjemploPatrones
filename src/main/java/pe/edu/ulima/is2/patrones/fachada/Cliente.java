package pe.edu.ulima.is2.patrones.fachada;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    static void main() {
        Inventario inventario = new Inventario();
        inventario.addItem(new Item("PS5", 12, 500f));
        inventario.addItem(new Item("Switch 2", 20, 400f));

        List<Item> itemsAComprar = new ArrayList<>();
        inventario.addItem(new Item("PS5", 1, 500f));
        inventario.addItem(new Item("PS5", 1, 500f));
        inventario.addItem(new Item("PS5", 1, 500f));
        inventario.addItem(new Item("PS5", 1, 500f));
        inventario.addItem(new Item("PS5", 1, 500f));
        inventario.addItem(new Item("PS5", 1, 500f));
        inventario.addItem(new Item("PS5", 1, 500f));
        inventario.addItem(new Item("PS5", 1, 500f));
        inventario.addItem(new Item("PS5", 1, 500f));
        inventario.addItem(new Item("PS5", 1, 500f));

        comprar(itemsAComprar, inventario);
    }

    public static void comprar(List<Item> items, Inventario inventario) {
        for (Item i : items) {
            if (!inventario.existeItem(i)) {
               return;
            }
        }

        Descuento descuento = new Descuento();
        float desc = descuento.aplicarDescuento(items);

        Shipping shipping = new Shipping();
        float costoShipping = shipping.calcularShipping(items);
    }


}
