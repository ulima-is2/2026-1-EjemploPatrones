package pe.edu.ulima.is2.patrones.decorator;

public class Milk extends BeverageDecorator{
    public Milk(String description, Beverage decorado) {
        super(description, decorado);
    }

    @Override
    public float cost() {
        return decorado.cost() + 2f;
    }
}
