import java.util.*;
import java.io.*;

public class DuplicateCounter {
    private Map<String, Integer> wordCounter = new HashMap<>();

    public void count(String dataFile) throws IOException {
        FileInputStream fileIS = null;
        Scanner inFS = null;
        System.out.println("Opening " + dataFile + ".");
        fileIS = new FileInputStream(dataFile);
        inFS = new Scanner(fileIS);
        String readWord = "";
        while (inFS.hasNext()) {
            readWord = inFS.next();
            if (!(wordCounter.containsKey(readWord))) {
                wordCounter.put(readWord, 1);
            } else {
                Integer count = wordCounter.get(readWord);
                wordCounter.put(readWord, count + 1);
            }
        }
        System.out.println("Closing " + dataFile + ".");
        inFS.close();
        fileIS.close();
    }

    public void write(String outputFile) throws IOException {
        System.out.println("Opening " + outputFile + ".");
        Writer fileWriter = new FileWriter(outputFile, false);
        for (Map.Entry<String, Integer> entry: wordCounter.entrySet()) {
            fileWriter.write(entry.getKey() + ": " + entry.getValue() + "\n");
        }
        System.out.println("Closing " + outputFile + ".");
        fileWriter.close();
    }
}
