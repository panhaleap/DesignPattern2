package builder_practice;

import java.util.Scanner;

public class Boat implements InsuranceBuilder{
    Scanner scanner;
    Insurance insurance;

    public Boat() {
        this.scanner = new Scanner(System.in);
        this.insurance = new Insurance();
    }

    @Override
    public void buildDriver() {
        System.out.println("Enter captain name: ");
        String captainName = scanner.next();
        System.out.println("Enter captain age: ");
        int captainAge = scanner.nextInt();
        insurance.driver = new Driver(captainName, captainAge);
    }

    @Override
    public void buildLocation() {
        System.out.println("Enter Ocean: ");
        String zipCode = scanner.next();
        insurance.location = new Location(zipCode);
    }

    @Override
    public void buildVehicle() {
        System.out.println("Enter boat make: ");
        String model = scanner.next();
        System.out.println("Enter boat year: ");
        int year = scanner.nextInt();
        insurance.vehicle = new Vehicle(model, year);
    }

    @Override
    public Insurance getInsurance() {
        return insurance;
    }
}
