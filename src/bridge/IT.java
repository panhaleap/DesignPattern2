package bridge;

public class IT extends Department {

    public IT(Employee employee){
        super(employee);
    }
    @Override
    public void assignEmployee() {
        System.out.print("IT department assigned: ");
        employee.employeeType();
    }
}
