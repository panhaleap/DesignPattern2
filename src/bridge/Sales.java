package bridge;

public class Sales extends Department{

    public Sales(Employee employee){
        super(employee);
    }
    @Override
    public void assignEmployee() {
        System.out.print("Sales department assigned :");
        employee.employeeType();
    }
}
