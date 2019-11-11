package chain_of_responsibility;

public class Numbers {
    public int number1;
    public int number2;
    public String calculationWanted;

    public Numbers(int number1, int number2, String calculationWanted) {
        this.number1 = number1;
        this.number2 = number2;
        this.calculationWanted = calculationWanted;
    }
}
