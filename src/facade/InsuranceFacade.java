package facade;

import java.util.Date;

public class InsuranceFacade {

    Car car;
    Driver driver;
    Location location;

    public InsuranceFacade(String vin, Date dob, String state){
        this.car = new Car(vin);
        this.driver = new Driver(dob);
        this.location = new Location(state);
    }

    public void getQuote(){
        car.checkCarHistory();
        car.checkCarSafety();
        driver.checkDriverDetails();
        location.checkDriverCondition();
    }
}
