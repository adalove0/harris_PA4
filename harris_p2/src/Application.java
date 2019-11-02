import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        DuplicateCounter duplicateCounter = new DuplicateCounter();
        String inputFile = "problem2.txt";
        String outputFile = "unique_word_counts.txt";
        try {
            duplicateCounter.count(inputFile);
            duplicateCounter.write(outputFile);
        } catch (IOException excpt) {
            System.out.println("Caught IOException: " + excpt.getMessage());
        }
    }
}
