package Decorator.MyDecorator;

public class VanillaIceCream extends IceCream {

    VanillaIceCream(){
       description = "Vanilla Ice Cream";
    }

    @Override
    public double cost() {
        return 25.5;
    }
}
