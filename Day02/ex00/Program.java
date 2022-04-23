package Day02.ex00;

import java.io.FileInputStream;
import java.util.*;

public class Program {

    private static String SIGN_FILE = "signatures.txt";
    public static void main(String[] args) {
        Map <String, String> signature = new HashMap<>();
        FileInputStream input;

        try {
            input = new FileInputStream(SIGN_FILE);
            Scanner scanner = new Scanner(input);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] lineArray = line.split(",");
                signature.put(lineArray[0], lineArray[1].replaceAll("\\s+", ""));
            }
            input.close();
            scanner.close();
        }
        catch (Exception e) {
            System.out.println("File not found");
            System.exit(-1);
        }



    }
}