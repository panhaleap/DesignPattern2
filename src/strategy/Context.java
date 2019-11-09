package strategy;

public class Context {
    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void executeStrategy(int a, int b){
        System.out.println("Result: " + strategy.execute(a, b));
    }
}
