package Decorator.MyDecorator;

public class GlazeSupplement extends IceCreamDecorator {

    private IceCream iceCream;

    GlazeSupplement(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Glaze Supplement";
    }

    @Override
    public double cost() {
        return iceCream.cost() + .45;
    }
}
