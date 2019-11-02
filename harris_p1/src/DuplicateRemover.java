import java.io.*;
import java.util.*;

public class DuplicateRemover {
    private ArrayList<String> uniqueWords = new ArrayList<String>();

    public void remove(String dataFile) throws IOException {
        FileInputStream fileIS = null;
        Scanner inFS = null;
        System.out.println("Opening " + dataFile);
        fileIS = new FileInputStream(dataFile);
        inFS = new Scanner(fileIS);
        String readWord = "";
        while (inFS.hasNext()) {
            readWord = inFS.next();
            if (!(uniqueWords.contains(readWord))) {
                uniqueWords.add(readWord);
            }
        }
        System.out.println("Closing " + dataFile + ".");
        inFS.close();
        fileIS.close();
    }

    public void write(String outputFile) throws IOException {
        System.out.println("Opening " + outputFile + ".");
        Writer fileWriter = new FileWriter(outputFile, false);
        for (String word: uniqueWords) {
            fileWriter.write(word + "\n");
        }
        System.out.println("Closing " + outputFile + ".");
        fileWriter.close();
    }
}
