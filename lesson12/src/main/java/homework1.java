import java.io.*;

public class homework1 {
    public static void main(String[] args) throws FileNotFoundException {
//input poem
        /*FileOutputStream outputFileName = new FileOutputStream("C:\\Users\\nasta\\IdeaProjects\\texts\\tms.txt");
        FileInputStream inputFileName = new FileInputStream( "C:\\Users\\nasta\\IdeaProjects\\texts\\tms.txt" );


        String longestWord = findLongestWord(inputFileName.toString());
        writeLongestWordToFile(outputFileName.toString(), longestWord);*/
    }

    public static String findLongestWord(String fileName) {
        String longestWord = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return longestWord;
    }

    public static void writeLongestWordToFile(String fileName, String longestWord) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(longestWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
