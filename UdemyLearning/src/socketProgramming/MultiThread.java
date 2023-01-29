package socketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiThread extends Thread {
    // fields
    private Socket socket;

    // constructor
    public MultiThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String echoString = input.readLine();
                System.out.println("Received client input: " + echoString);
                if (echoString.equals("exit")) {
                    break;
                }

                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
                output.println("Echo from server: " + echoString);
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Oops : " + e.getMessage());
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                // TODO: handle exception
            }
        }
    }
/* From single thread main
    public static void main(String[] args) {
        // common practise to wrap the input stream with a bufferedReader and
        // wrap OutputStream with the print writer
        try (ServerSocket ss = new ServerSocket(5000)) {

            while (true) {

                Socket socket = ss.accept();
                System.out.println("Client connected");

                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
                String echoString = input.readLine();
                // this try catch block allows a server to "sleep" for a time when the server
                // receives an input from the client. not good as it is still running on a
                // single thread and it needs to handles each client on separate threads
                // this allows the server to be more responsive to client connection requests
                // and prevent 1 client from hogging the server too long
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }

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
    }*/
}
