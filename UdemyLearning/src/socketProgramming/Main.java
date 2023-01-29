package socketProgramming;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    
    public static void main(String[] args) {
        
        try(ServerSocket serverSocket = new ServerSocket(5000)) {
            
            while (true) {
                new MultiThread(serverSocket.accept()).start();
                // Socket socket = serverSocket.accept();
                // MultiThread multiThread = new MultiThread(socket);
                // multiThread.start();
            }
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
        }
    }
}
