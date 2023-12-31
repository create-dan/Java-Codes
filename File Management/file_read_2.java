import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class file_read_2 {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream))) {

            // Perform file writing operations here
            bufferedWriter.write("Hello, this is a line in the file.");
            bufferedWriter.newLine();
            bufferedWriter.write("Another line.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
