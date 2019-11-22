package flyweight_practice;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private Memory memory = new Memory();
    private List<FontProperty> letters = new ArrayList<>();

    public void typeLetter(char letter){
        FontProperty fontProperty = memory.lookUp(letter);
        letters.add(fontProperty);
    }

    public void process(){
        for(FontProperty item : letters){
            item.display();
        }
    }

    public void report(){
        System.out.println("Total items " + memory.totalObjectsMade());
    }
}
