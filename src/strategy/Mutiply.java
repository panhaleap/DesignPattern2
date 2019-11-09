package strategy;

public class Mutiply implements Strategy{
    @Override
    public int execute(int a, int b) {
        return (a * b);
    }
}
