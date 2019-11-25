package flyweight_practice2;

import java.util.Scanner;

public class TestDocument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Document document = new Document();
        String letter = null;
        do{
            letter = scanner.nextLine();
            if(letter.equals("")){break;}
            document.typeLetter(letter.charAt(0));
        }while (letter != "");

        document.process();
        document.report();
    }
}
