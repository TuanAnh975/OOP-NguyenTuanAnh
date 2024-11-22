package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "test.txt"; // Modify this to the file you want to read
        
        try {
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
            long startTime = System.currentTimeMillis();
            
            StringBuilder sb = new StringBuilder();
            for (byte b : inputBytes) {
                sb.append((char)b);
            }
            String outputString = sb.toString();
            
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}