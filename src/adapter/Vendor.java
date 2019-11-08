package adapter;

public interface Vendor {
    public void connectToDB(String connectionString, String customerId);
    public String printAge();
}
