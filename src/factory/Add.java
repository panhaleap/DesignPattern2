package factory;

public class Add implements Calculate {
    @Override
    public void calculate(double num1, double num2) {
        System.out.println("a + b: "+(num1+num2));
    }
}
