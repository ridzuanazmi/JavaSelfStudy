package socketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Single threaded and multi threaded.
 * change the call toaccept that it taked place within the loop
 * 
 */

public class SingleThreadMain {
 
    public static void main(String[] args) {
//      common practise to wrap the input stream with a bufferedReader and
//      wrap OutputStream with the print writer
        try (ServerSocket ss = new ServerSocket(5000)) {
        //  going to block until a client with port 5000 connects to the server
            Socket socket = ss.accept();
            System.out.println("Client connected");
        //  When client does connect, the server will use input and OutputStream
        //  to send/receive data to/from the client 
        //  wraps the BufferedReader with the InputStream
            BufferedReader input = new BufferedReader
            (new InputStreamReader(socket.getInputStream()));
        //  Wraps the PrintWriter with the OutputStream
        //  auto flush set to true so dont have to call flush method to ensure data is
        //  actually sent
            PrintWriter output = new PrintWriter
            (socket.getOutputStream(), true); 

            while (true) {
                String echoString = input.readLine();
                if (echoString.equals("exit")) {
                    break;
                }
                System.out.println("Client says: " + echoString);
                output.println("Echo from server: " + echoString);
            }
        } catch (IOException e) {
            System.out.println("Server exception" + e.getMessage());
            e.printStackTrace();
        }
    }
}
