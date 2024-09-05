package useSocket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 9999);

            // Read Data
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            // Write Data
            PrintStream printStream = new PrintStream(socket.getOutputStream());

            System.out.println("Client connected");
            Scanner scanner = new Scanner(System.in);
            while (true) {

                String input = scanner.nextLine();
                printStream.println("Client Message:" + input);

                String pullData = bufferedReader.readLine().trim();
                System.out.println(pullData);
            }

        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
