package builder_practice;

public interface InsuranceBuilder {
    public void buildDriver();
    public void buildLocation();
    public void buildVehicle();
    public Insurance getInsurance();
}
