package Lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jmiller
 */
public class TextReaderApp {

    public static void main(String[] args) {

        File data = new File(File.separatorChar + "temp" + File.separatorChar + "lab1" + File.separatorChar + "address.txt");

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem reading this file!");
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }
    }
}
