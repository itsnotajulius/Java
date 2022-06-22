package InputandOutput.Intro.src.com.itsnotajulius;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private static String locFilePath = "C:/Users/PC/Documents/Coding/Java/Java/SmallProjects/InputandOutput/Intro/src/com/itsnotajulius";

    public static void main(String[] args) throws IOException {
        try (FileWriter locFile = new FileWriter(locFilePath + "/locations.txt");
                FileWriter dirFile = new FileWriter(locFilePath + "/directions.txt")) {
            for (Location location : locations.values()) {
                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
                for (String direction : location.getExits().keySet()) {
                    dirFile.write(
                            location.getLocationID() + "," + direction + "," + location.getExits().get(direction)
                                    + "\n");
                }
            }
        }
        System.out.println("asdas");

    }

    static {

        try (Scanner scanner = new Scanner(new FileReader(locFilePath + "/locations.txt"))) {
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
                System.out.println("Imported Loc: " + loc + ": " + description);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(locFilePath + "/directions.txt")))) {
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String direction = scanner.next();
                scanner.skip(scanner.delimiter());
                String dest = scanner.nextLine();
                int destination = Integer.parseInt(dest);
                System.out.println(loc + ": " + direction + ": " + destination);
                Location location = locations.get(loc);
                location.addExit(direction, destination);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {

        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {

        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {

        return locations.containsKey(value);
    }

    @Override
    public Location get(Object key) {

        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {

        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {

        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {

        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {

        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {

        return locations.entrySet();
    }

}
