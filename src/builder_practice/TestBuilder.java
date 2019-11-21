package builder_practice;

public class TestBuilder {
    public static void main(String[] args) {
        InsuranceBuilder nyBenz = new Auto();
        EngineerDirector engineerDirector = new EngineerDirector(nyBenz);
        engineerDirector.constructInsurance();

        Insurance insurance = engineerDirector.returnInsurance();
        System.out.println(insurance);
    }
}
