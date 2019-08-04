package Decorator.MyDecorator;

public class ChocolateChipSupplement extends IceCreamDecorator {

    private IceCream iceCream;

    ChocolateChipSupplement(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Chocolate Chip Supplement";
    }

    @Override
    public double cost() {
        return .90 + iceCream.cost();
    }
}
