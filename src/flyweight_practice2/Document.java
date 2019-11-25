package flyweight_practice2;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private Memory memory = new Memory();
    private List<FontProperty> items = new ArrayList<>();

    public void typeLetter(char letter){
        FontProperty fontProperty = memory.lookUp(letter);
        items.add(fontProperty);
    }
    public void process(){
        for(FontProperty fontProperty : items){
            fontProperty.display();
        }
    }
    public void report(){
        System.out.println("Total items " + memory.totalObjMade());
    }
}