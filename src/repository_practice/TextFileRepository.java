package repository_practice;

import java.io.*;

public class TextFileRepository implements Repository<Contact>{

    String path = "E:\\workspace\\JavaPrograms\\DesignPattern\\MyTextDatabase.txt";

    @Override
    public void add(Contact obj) {
        FileWriter writer;
        try {
            writer = new FileWriter(path, true);
            writer.write(" " + obj.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(Contact obj) {

    }

    @Override
    public String getAll() {
        String temp = "";
        try {
            FileReader reader = new FileReader(path);

            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null){
                temp += line;
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }
}
