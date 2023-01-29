package IOStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {
    
    public static void main(String[] args) throws IOException {
        // File reader/writer reads/writes non-byte data
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("src/learning/IOStreams/charStream.txt");
            fw = new FileWriter("src/learning/IOStreams/charOutput.txt");

            // reading source file and writing its content to the destination file 
            // char by char
            int content;
            while ((content = fr.read()) != -1) {
                fw.write((char) content);
            }
        } finally {
            if (fr != null) {
                fr.close();
            }
            if (fw != null) {
                fw.close();
            }
        }
    }
}
