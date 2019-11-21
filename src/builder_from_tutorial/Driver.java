package builder_from_tutorial;

public class Driver {
	
	private String name;
    public int age;

    public Driver(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return this.name + "(" + this.age + ")";

    }

}
