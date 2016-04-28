import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

// Compile and run this program to see how Java does IO.
public class JavaIO {

    public static void main(String[] args) {

        // Prompt the user for name
        System.out.print("Your name: ");

        // Create a Scanner that reads from System's standard in
        Scanner stdin = new Scanner(System.in);

        // Read a line from the user's keyboard input.
        String name = stdin.nextLine();

        // Output the name to standard out.
        System.out.println("Hello, " + name);

        String fileLocation = "name.txt";
        // Create or overwrite a file called "name.txt" and put the name and numbers 0 ~ 9 in it.
        try (PrintWriter out = new PrintWriter(fileLocation)) {
            out.println(name);
            for (int i = 0; i < 10; i++) {
                out.println(i);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Writing to a file failed. Cause: " + e.getMessage());
            System.exit(-1); //If something goes wrong, let's terminate the program.
        }

        // Create a Path object from our file location
        Path path = Paths.get(fileLocation);
        try {
            // Read from the Path and print all the lines.
            List<String> lines = Files.readAllLines(path, Charset.defaultCharset());
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Reading from a file failed. Cause: " + e.getMessage());
            System.exit(-1); //If something goes wrong, let's terminate the program.
        }
    }
}