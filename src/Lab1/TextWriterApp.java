package Lab1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author jmiller
 */
public class TextWriterApp {
    public static void main(String[] args) throws IOException{
        boolean append = true;
        
        File data = new File(File.separatorChar + "temp" + File.separatorChar + "lab1" + File.separatorChar+ "address.txt");
        
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data, append)));
        
        out.println("Bob Brown");
        out.println("123 Main St");
        out.println("Waukesha, WI 53186");
        out.close();
    }
}
