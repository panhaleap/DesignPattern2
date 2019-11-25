package flyweight_practice2;

public class FontProperty {
    private char letter;
    private int fontSize;
    private String fontColor;

    public FontProperty(char letter, int fontSize, String fontColor) {
        this.letter = letter;
        this.fontSize = fontSize;
        this.fontColor = fontColor;
    }

    public void display(){
        System.out.println(this.letter);
    }
}
