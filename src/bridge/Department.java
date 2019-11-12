package bridge;

public abstract class Department {
    Employee employee;
    public Department(Employee employee){
        this.employee = employee;
    }
    public abstract void assignEmployee();
}
