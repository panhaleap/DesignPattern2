package bridge;

public class Main {
    public static void main(String[] args) {
        Department department1 = new Sales(new FullTime());
        department1.assignEmployee();

        Department department2 = new IT(new FullTime());
        department2.assignEmployee();

        Department department3 = new IT(new PartTime());
        department3.assignEmployee();
    }
}
