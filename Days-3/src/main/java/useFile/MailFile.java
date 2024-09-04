package useFile;

import java.util.List;
import java.util.UUID;

public class MailFile {
    public static void main(String[] args) {

        Manager manager = new Manager();
        //manager.createFile();
        //manager.deleteFile();
        manager.writeToFile( UUID.randomUUID().toString() );
        List<String> ls = manager.readFromFile();
        for (String line : ls) {
            System.out.println(line);
        }

    }
}
