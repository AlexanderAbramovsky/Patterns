package Decorator.MyDecorator;

public class ChocolateIceCream extends IceCream {

    ChocolateIceCream(){
        description = "Chocolate Ice Cream";
    }

    @Override
    public double cost() {
        return 30.25;
    }
}
