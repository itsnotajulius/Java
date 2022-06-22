import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class IOFiler {
    private Scanner scFile;
    private boolean isFilePathValid;
    private int totalWords;

    public IOFiler(String pathToFile) {
        this.isFilePathValid = true;
        try {
            this.scFile = new Scanner(new URL(pathToFile).openStream());
        } catch (Exception e) {
            try {
                this.scFile = new Scanner(new BufferedReader(new FileReader(pathToFile)));
            } catch (Exception e1) {
                this.isFilePathValid = false;
                System.err.println("This is not a proper URL or Absolute File Path");
            }
        }
    }

    public void printToFile() {
        totalWords = 0;
        if (isFilePathValid) {
            try (BufferedWriter scWrite = new BufferedWriter(new FileWriter("Output3.res"))) {
                while (scFile.hasNextLine()) {
                    String[] lineData = scFile.nextLine().split(" ");
                    if (!(lineData.length == 1)) {
                        for (String word : lineData) {
                            // word = replaceString(word);
                            word = word.replaceAll("[^a-zA-Z0-9']", "");
                            if (!word.equals("")) {
                                totalWords++;
                                scWrite.write(word + "\n");
                            }

                        }
                    }
                }
                scWrite.write("Total Words: " + totalWords);
            } catch (IOException e) {
                System.out.println("Problems with Writing file");
            }

        } else {
            System.out.println("Wont be able to print to Output Doc as Path to input Doc is incorrect");
        }
    }

    /*
     * private String replaceString(String word) {
     * return word.replace("\"", "").replace(".", "").replace("-", "").replace(",",
     * "");
     * }
     */
}
