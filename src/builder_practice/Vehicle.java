package builder_practice;

public class Vehicle {
    String model;
    int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return model +", year: "+ year;
    }
}
