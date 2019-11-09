package facade;

import java.util.Date;

public class Driver {
    Date dob;

    public Driver(Date dob){
        this.dob = dob;
    }
    public void checkDriverDetails(){
        System.out.println("Check driver history "+ dob);
    }
}
