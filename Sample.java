import java.io.*;
import java.util.Scanner;

public class Sample {
    public static Boolean findName(File filename) {
        Scanner scan = null;

        try {
            scan = new Scanner(filename);

            while (scan.hasNext()) {
                if (scan.nextLine().equals("Emm")) {
                    return true;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            scan.close();
        }
        return false;
    }

    public static void main (String[] args) {
        boolean result = findName(new File("Names.txt"));
        System.out.println(result);
    }
}