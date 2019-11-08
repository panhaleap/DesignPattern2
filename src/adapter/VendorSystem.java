package adapter;

public class VendorSystem implements Vendor {
    int age;
    @Override
    public void connectToDB(String connectionString, String customerId) {
        System.out.println("Using connstring connect to database and fetch age of customer and set age");
        age = 40;
    }

    @Override
    public String printAge() {
        System.out.println("Age = "+ age);
        return age + "";
    }
}
