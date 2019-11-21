package builder_practice;

import java.util.Scanner;

public class Auto implements InsuranceBuilder{
    Scanner scanner;
    Insurance insurance;

    public Auto(){
        scanner = new Scanner(System.in);
        this.insurance = new Insurance();
    }
    @Override
    public void buildDriver() {
        System.out.println("Enter driver name: ");
        String driverName = scanner.next();
        System.out.println("Enter driver age: ");
        int driverAge = scanner.nextInt();
        insurance.driver = new Driver(driverName, driverAge);
    }

    @Override
    public void buildLocation() {
        System.out.println("Enter zip code: ");
        String zipCode = scanner.next();
        insurance.location = new Location(zipCode);
    }

    @Override
    public void buildVehicle() {
        System.out.println("Enter model: ");
        String model = scanner.next();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        insurance.vehicle = new Vehicle(model, year);
    }

    @Override
    public Insurance getInsurance() {
        if(insurance.driver.age > 25){
            insurance.price = 50;
        }
        return insurance;
    }
}
