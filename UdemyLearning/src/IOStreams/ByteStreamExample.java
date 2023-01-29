package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    
    /*
     * Input involes reading data from a source. reading from System.in
     * Output involves writing data to a destination 
     * source/destination is most likely files.
     * File class allows us to make new directory or present users with a list of files
     * to choose from
     */

     public static void main(String[] args) throws IOException {
        // FIS and FOS read/write byte-data
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {fis = new FileInputStream("src/learning/IOStreams/byteStream.txt"); //read from source
            
            fos = new FileOutputStream("src/learning/IOStreams/byteoutput.txt"); // specifies destination

            // reads 1 byte at a time and returns -1 if reached the end
            // reads from fis and write using FOS.write method to the destination specified
            // in fos
            int content;
            while ((content = fis.read()) != -1) {
                fos.write((byte) content); // use casting to convert int content into byte
            }
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();

            }
        }
        
     }
}
