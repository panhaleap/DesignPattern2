package composite;

import java.util.ArrayList;

public class Manager implements Employee {
    String name;
    double salary;
    ArrayList<Employee> employees;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
        employees = new ArrayList<>();
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChild(int index) {
        return employees.get(index);
    }

    @Override
    public void print() {
        System.out.println("------------Manager------------");
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
        for(Employee employee : employees){
            employee.print();
        }
    }
}
