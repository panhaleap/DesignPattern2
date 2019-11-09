package strategy;

public class Main {
    public static void main(String[] args) {
        Context obj = new Context(new Add());
        obj.executeStrategy(1,1);

        obj = new Context(new Mutiply());
        obj.executeStrategy(1,1);

        obj = new Context(new Substract());
        obj.executeStrategy(1,1);
    }
}
