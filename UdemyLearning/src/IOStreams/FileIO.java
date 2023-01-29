package IOStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

    public static void main(String[] args) {

        String[] names = { "John", "Carl", "Hakeem" };
        // To write to a file, we use buffered writer
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write("Writing to a file");
            bw.write("\nAnother line to a file");
            for (String name : names) {
                bw.write("\n" + name);
            }
            bw.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // To read a file, we use a buffered reader
        try {
            BufferedReader br = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
