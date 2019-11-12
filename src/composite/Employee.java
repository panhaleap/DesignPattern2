package composite;

public interface Employee {
    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int index);
    public void print();
}
