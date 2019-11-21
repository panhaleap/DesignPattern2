package builder_practice;

public class Insurance {
    Driver driver;
    Location location;
    Vehicle vehicle;
    double price;

    @Override
    public String toString() {
        return "Insurance{" +
                "driver=" + driver +
                ", location=" + location +
                ", vehicle=" + vehicle +
                ", price=" + price +
                '}';
    }
}
