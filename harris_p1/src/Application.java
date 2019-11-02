import java.io.IOException;
import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        String dataFile = "problem1.txt";
        String outputFile = "unique_words.txt";
        try {
            duplicateRemover.remove(dataFile);
            duplicateRemover.write(outputFile);
        } catch (IOException excpt) {
            System.out.println("Caught IOException: " + excpt.getMessage());
        }
    }
}
