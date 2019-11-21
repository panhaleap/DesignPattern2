package builder_practice;

public class Location {
    String zipcode;

    public Location(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return zipcode;
    }
}
