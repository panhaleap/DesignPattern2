package facade;

public class Car {
    String vin;

    public Car(String vin){
        this.vin = vin;
    }
    public void checkCarHistory(){
        System.out.println("Check carfax report for "+ vin);
    }
    public void checkCarSafety(){
        System.out.println("Check safety report for "+ vin);
    }
}
