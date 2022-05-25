package mypack.array;

import java.util.Scanner;

public class Main {
    
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList grocList = new GroceryList();
    
    

    public static int ifValidInput(Scanner sc,int num){
        int numInt = 0;
        do {
            if(sc.hasNextInt()){
                numInt = sc.nextInt();
                break;
            }
            sc.nextLine();
        } while (true);

        return numInt;
    }

    public static void printInstructions(){
        System.out.println("\n Press");
        System.out.println("\t 0 - Instructions");
        System.out.println("\t 1 - List Items");
        System.out.println("\t 2 - Add Item");
        System.out.println("\t 3 - Mod Item");
        System.out.println("\t 4 - Remove Item");
        System.out.println("\t 5 - Search Item");
        System.out.println("\t 6 - Quit");
    }
    
    public static void addItem(){
        System.out.println("Enter Item: ");
        grocList.addGrocItem(scanner.nextLine());
    } 

    public static void modifyItem(){
        System.out.println("Eneter item Name to be modded: ");
        String oldItem = scanner.nextLine();
        System.out.println("Enter Replacement: ");
        String newItem = scanner.nextLine();
        grocList.modGrocItem(newItem,oldItem);  
    }

    public static void removeItem(){
        System.out.println("Eneter item name: ");       
        grocList.removeGrocItme(scanner.nextLine());
    }

    public static void searchItem(){
        System.out.println("Eneter item number: ");
        String searchItem = scanner.nextLine();
        if(grocList.onFile(searchItem)){
            System.out.println("Found Item: "+searchItem);
        }else{
            System.out.println(searchItem+" Not Found");
        }
    } 



    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Eneter your choice: ");
            choice = ifValidInput(scanner,1);
            if(scanner.hasNextLine()){
                scanner.nextLine();
            }
            
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    grocList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }



        }
        scanner.close();
        String[] myArray = new String[grocList.getGroceryList().size()];
        System.out.println(grocList.getGroceryList().toArray());
        System.out.println(myArray.toString());
        myArray =  grocList.getGroceryList().toArray(myArray);
        System.out.println(myArray.toString());
    }



    
}
