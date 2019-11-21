package builder_from_tutorial;

public class Insurance {
	public Driver driver;
    public Location location;
    public Vehicle vehicle;
    public double price;

    public String toString()
    {

        return "Insurance has these values " +
                "\nDriver  : " + this.driver +
                "\nLocation: " + this.location +
                "\nVehicle  : " + this.vehicle +
                "\nPrice  : " + this.price;

    }

}
