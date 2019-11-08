package adapter;

public class ClientSystem implements Client {

    @Override
    public String connectToFileSystem(String customerId) {
        System.out.println("Connect to local text file and return age of customers");
        return "32";
    }
}
