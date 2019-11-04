package factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean quit = false;
        while (!quit){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number1: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter number2: ");
            double num2 = scanner.nextDouble();

            System.out.println("Enter Calculate Type: ");
            String type = scanner.next();

            CalculateFactory factory = new CalculateFactory();
            Calculate calculate = factory.getCalculation(type);
            if(calculate != null) {
                calculate.calculate(num1, num2);
            }
            System.out.println("Continue? Press N to quit or anything to continue!");
            String cont = scanner.next();
            quit = cont.toLowerCase().equals("n");
        }

    }
}
