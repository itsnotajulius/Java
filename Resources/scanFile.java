import java.io.*;
import java.util.*;


public class scanFile {

    public static void main(String[] args) throws IOException {
    // TODO code application logic here

    // // read KeyWestTemp.txt

    // create token1
    String token1 = "";
    final String FILE_NAME =   "C:/Users/ItsNotAJulius/Documents/Coding/Java/Currencies/src/currencies.txt";

    // for-each loop for calculating heat index of May - October

    // create Scanner inFile1
    Scanner inFile1 = new Scanner(new File(FILE_NAME)).useDelimiter(";\\s*");

    // Original answer used LinkedList, but probably preferable to use ArrayList in most cases
    // List<String> temps = new LinkedList<String>();
    List<String> temps = new ArrayList<String>();

    // while loop
    while (inFile1.hasNextLine()) {
      // find next line
      while (inFile1.hasNext()) {
        token1 = inFile1.next();
        temps.add(token1);
      }
      
    }
    inFile1.close();

    String[] tempsArray = temps.toArray(new String[0]);

    for (String s : tempsArray) {
      System.out.println(s);
    }
  }
}