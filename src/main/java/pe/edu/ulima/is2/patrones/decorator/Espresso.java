package pe.edu.ulima.is2.patrones.decorator;

public class Espresso extends Beverage{
    public Espresso(String description) {
        super(description);
    }

    @Override
    public float cost() {
        return 10;
    }
}
