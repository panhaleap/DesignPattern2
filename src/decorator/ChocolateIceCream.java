package decorator;

public class ChocolateIceCream extends IceCream {
    @Override
    public String getDescription() {
        return "Chocolate IceCream";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
