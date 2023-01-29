package socketProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Scanner;

/*
 * Single threaded and multi threaded
 * 
 */

public class EchoClient {

    public static void main(String[] args) {
    //  need address of the host and the port number
        try (Socket socket = new Socket("localhost", 5000)){

        //  set a timeout if there is no input and set a catch exception in this
        //  try-catch block
            socket.setSoTimeout(5000);
        //  wraps buffered reader and inputstream
            BufferedReader input = new BufferedReader
            (new InputStreamReader(socket.getInputStream()));

        //  wraps printwriter with outputstream
            PrintWriter output = new PrintWriter
            (socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            String echo;
            String response;

            do {
                System.out.print("Enter string to pass to server: ");
                echo = scanner.nextLine();            
            //  PrintWriter output will write to the server
                output.println(echo);

                if (!echo.equals("exit")) {
                // read string from server and prints out
                    response = input.readLine(); 
                    System.out.println(response);
                }

            } while (!echo.equals("exit"));

        } catch (SocketTimeoutException e) {
            System.out.println("The socket timed out");
        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
