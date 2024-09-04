package useFile;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {

    private File file = new File("sample.txt");

    public void createFile() {
        try {
            file.createNewFile();
        }catch (Exception e) {}
    }

    public void deleteFile() {
        try {
            file.delete();
        }catch (Exception e) {}
    }

    public void writeToFile( String line ) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(line);
            fileWriter.write(System.lineSeparator());
            fileWriter.close();
        }catch (Exception ex) {}
    }

    public List<String> readFromFile() {
        List<String> ls = new ArrayList<String>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                ls.add(line);
            }
        }catch (Exception e) {}
        return ls;
    }

}
