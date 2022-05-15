import java.io.*;
import java.util.*;


public class scanFile {

    public static void main(String[] args) throws IOException {
        // create token1
    String token1 = "";
    final String FILE_NAME =   "C:/Users/ItsNotAJulius/Documents/Coding/Java/Currencies/src/currencies.txt";

    

    // create Scanner sc
    Scanner sc = new Scanner(new File(FILE_NAME)).useDelimiter(";\\s*");

    
    List<String> temps = new ArrayList<String>();

    // while loop
    while (sc.hasNextLine()) {
      // find next line
      while (sc.hasNext()) {
        token1 = sc.next();
        temps.add(token1);
      }
      
    }
    sc.close();

    String[] tempsArray = temps.toArray(new String[0]);

    for (String s : tempsArray) {
      System.out.println(s);
    }
  }
}