package Decorator.MyDecorator;

public class Test {

    public static void main(String[] args) {

        IceCream iceCream1 = new VanillaIceCream();

        System.out.println(iceCream1.getDescription() + " price: " + iceCream1.cost());

        iceCream1 = new ChocolateChipSupplement(iceCream1);

        System.out.println(iceCream1.getDescription() + " price: " + iceCream1.cost());

        iceCream1 = new GlazeSupplement(iceCream1);

        System.out.println(iceCream1.getDescription() + " price: " + iceCream1.cost());
    }

}
