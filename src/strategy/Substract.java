package strategy;

public class Substract implements Strategy{
    @Override
    public int execute(int a, int b) {
        return (a - b);
    }
}
