package Entity;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("./falcon.csv"));
            String content;
            // Read the first line in the file
            content = scanner.nextLine();
            // Split the values into separate array elements
            String[] values = content.split(",");

            NPC falcon;
            // Create the NPC object using the file's contents
            falcon = new NPC(Integer.parseInt(values[0]), Float.parseFloat(values[1]), values[2], values[3], Float.parseFloat(values[4]), Float.parseFloat(values[5]));
            // Print the values of the falcon object
            System.out.println(falcon);

        } catch(Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
