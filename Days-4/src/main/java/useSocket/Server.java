package useSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
    public static void main(String[] args) {

        try {

            // Port Permission
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();

            // Read Data
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            // Write Data
            PrintStream printStream = new PrintStream(socket.getOutputStream());

            while (true) {
                // Read Plain Text
                String message = bufferedReader.readLine().trim();
                System.out.println(message);

                // Send Auto message Data
                Date date = new Date();
                String sendData = "Auto Send Data : " + date;
                printStream.println(sendData);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
