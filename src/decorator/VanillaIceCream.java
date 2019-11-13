package decorator;

public class VanillaIceCream extends IceCream {
    @Override
    public String getDescription() {
        return "Vanilla IceCream";
    }

    @Override
    public double cost() {
        return 1.00;
    }
}
