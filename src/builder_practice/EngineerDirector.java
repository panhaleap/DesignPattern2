package builder_practice;

public class EngineerDirector {
    InsuranceBuilder insuranceBuilder;

    public EngineerDirector(InsuranceBuilder insuranceBuilder){
        this.insuranceBuilder = insuranceBuilder;
    }

    public Insurance returnInsurance(){
        return insuranceBuilder.getInsurance();
    }
    public void constructInsurance(){
        insuranceBuilder.buildLocation();
        insuranceBuilder.buildVehicle();
        insuranceBuilder.buildDriver();
    }
}
