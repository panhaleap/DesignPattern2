package facade;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        InsuranceFacade obj = new InsuranceFacade("1234", new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1980"), "DC");
        obj.getQuote();
    }
}
