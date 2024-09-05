package useFile;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {

        try {
            String path = "resim.jpg";
            FileInputStream fileInputStream = new FileInputStream(path);

            FileChannel fileChannel = fileInputStream.getChannel();
            long size = fileChannel.size();

            ByteBuffer byteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, size);
            CharBuffer charBuffer = StandardCharsets.ISO_8859_1.decode(byteBuffer);

            Scanner scanner = new Scanner(charBuffer);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }


        }catch (Exception ex) {
            System.err.println("File Read Error : " + ex.getMessage());
        }


    }
}
