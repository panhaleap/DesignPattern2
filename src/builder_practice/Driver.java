package builder_practice;

public class Driver {
    String name;
    int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name +"("+ age +" years old)";
    }
}
