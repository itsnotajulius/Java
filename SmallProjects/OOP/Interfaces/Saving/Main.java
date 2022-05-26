package src.Interfacess.Saving;

import java.util.*;

public class Main{

    public static void main(String[] args) {
        Player tim = new Player("Tim", 410);
        System.out.println(tim.toString());
        saveObject(tim);
        
        tim.setHealth(8);
        System.out.println(tim);
        saveObject(tim);
        //loadObject(tim);

        System.out.println(tim);




        ISaveable werewolf = new Monster("werewolf", 40);


        System.out.println(werewolf);
        saveObject(werewolf);


    }



    public static void saveObject(ISaveable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving "+objectToSave.write().get(i)+ " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

///////////////////////////////////////////////////////

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("\nChoose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            while(!scanner.hasNextInt()){
                System.out.println("Choose an option: ");
                scanner.next();
            }
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
                default:
                    System.out.println("Thats not an Input");
            }
        }
        scanner.close();
        return values;
    }

    
    
}
