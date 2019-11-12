package composite;

public class Developer implements Employee {
    String name;
    double salary;

    public Developer(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    @Override
    public void add(Employee employee) {
        //This leaf so this method is not applicable for this class
    }

    @Override
    public void remove(Employee employee) {
        //This leaf so this method is not applicable for this class
    }

    @Override
    public Employee getChild(int index) {
        //This leaf so this method is not applicable for this class
        return null;
    }

    @Override
    public void print() {
        System.out.println("------------Developer------------");
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
    }
}
