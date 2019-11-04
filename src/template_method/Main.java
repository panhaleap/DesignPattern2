package template_method;

public class Main {
    public static void main(String[] args) {
        ExcelFile excelFile = new ExcelFile();
        excelFile.readProcessAndSave();
//        excelFile.readData();
//        excelFile.processData();
//        excelFile.saveData();

        TextFile textFile = new TextFile();
        textFile.readProcessAndSave();
//        textFile.readData();
//        textFile.processData();
//        textFile.saveData();
    }
}
