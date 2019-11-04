package template_method;

public class ExcelFile extends DataProcessor{

//    public void readProcessAndSave(){
//        readData();
//        processData();
//        saveData();
//    }
    public void readData(){
        System.out.println("Read data from excel");
    }

    public void processData(){
        System.out.println("Process data from excel");
    }

//    public void saveData(){
//        System.out.println("Save data to database");
//    }
}
