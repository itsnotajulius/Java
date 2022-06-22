package InputandOutput.Intro.src.com.itsnotajulius;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LocationsWithBytes implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();
    private static String locFilePath = "C:/Users/PC/Documents/Coding/Java/Java/SmallProjects/InputandOutput/Intro/src/com/itsnotajulius";

    public static void main(String[] args) throws IOException {
        try (DataOutputStream locFile = new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream(locFilePath + "/locations.dat")))) {
            for (Location location : locations.values()) {
                locFile.writeInt(location.getLocationID());
                locFile.writeUTF(location.getDescription());
                System.out.println("Writing location: " + location.getLocationID() + " : " + location.getDescription());
                System.out.println("Writing " + (location.getExits().size() - 1) + " exits.");
                locFile.writeInt(location.getExits().size() - 1);
                for (String direction : location.getExits().keySet()) {
                    if (!direction.equalsIgnoreCase("Q")) {
                        System.out.println("\t\t" + direction + "," + location.getExits().get(direction));
                        locFile.writeUTF(direction);
                        locFile.writeInt(location.getExits().get(direction));
                    }
                }
            }

        }

    }

    static {

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(locFilePath + "/locations_big.txt")))) {
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String description = data[1];
                Map<String, Integer> tempExit = new LinkedHashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
                System.out.println("Imported Loc: " + loc + ": " + description);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(locFilePath + "/directions_big.txt")))) {
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);
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
