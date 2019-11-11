package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Chain obj1 = new Add();
        Chain obj2 = new Substract();
        Chain obj3 = new Multiply();
        Chain obj4 = new Divide();

        obj1.setNextChain(obj2);
        obj2.setNextChain(obj3);
        obj3.setNextChain(obj4);

        Numbers numbers = new Numbers(10, 5, "Divide");
        obj1.calculate(numbers);
    }
}
