package composite;

public class Main {
    public static void main(String[] args) {
        Employee developer1 = new Developer("Ka", 200);
        Employee developer2 = new Developer("Bau", 300);

        Employee manager = new Manager("Vany", 1000);
        manager.add(developer1);
        manager.add(developer2);

        Employee developer3 = new Developer("Heek", 700);

        Employee director = new Manager("Soriya", 5000);
        director.add(manager);
        director.add(developer3);

        director.print();
    }
}
