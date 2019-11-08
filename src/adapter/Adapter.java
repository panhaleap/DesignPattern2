package adapter;

public class Adapter implements Client {
    Vendor vendor;
    public Adapter(Vendor vendor){
        this.vendor = vendor;
    }
    @Override
    public String connectToFileSystem(String customerId) {
        String connectionString = "Oracle";
        vendor.connectToDB(connectionString, customerId);
        return vendor.printAge();
    }
}
