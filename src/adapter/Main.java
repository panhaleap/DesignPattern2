package adapter;

public class Main {
    public static void main(String[] args) {
//        Client client = new ClientSystem();
//        client.connectToFileSystem("1234");

        Vendor vendor = new VendorSystem();
        //vendor.connectToDB("Oracle", "1234");

        Adapter obj = new Adapter(vendor);
        obj.connectToFileSystem("1234");
    }
}
