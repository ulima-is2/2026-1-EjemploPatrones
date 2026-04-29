package pe.edu.ulima.is2.patrones.decorator;

public class Cliente {
    static void main() {
        Beverage cafe = new Espresso("Cafe simple");
        Beverage cafeConLeche = new Milk("Leche", cafe);
        Beverage cafeConLecheChocolatada = new Chocolate(
                "Chocolate",
                cafeConLeche);

        System.out.println(cafeConLecheChocolatada.cost());
        System.out.println(cafeConLeche.cost());
        System.out.println(
                new Chocolate(
                        "Chocolate",
                        new Espresso("Simple")
                ).cost()
        );
    }
}
