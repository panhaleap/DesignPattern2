package facade;

public class Location {
    String state;

    public Location(String state){
        this.state = state;
    }
    public void checkDriverCondition(){
        System.out.println("Get location for "+ state);
    }
}
