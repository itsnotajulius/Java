package mypack.array;

import java.util.*;


public class ArraysStuff {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static int[] getIntegers(int capacity){
        int[] value = new int[capacity];
        for(int i = 0; i<value.length;i++){
            value[i] = ifInts(scanner,i);
        } 

        return value;

    }

    public static int ifInts(Scanner sc,int num){
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

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number "+i+" , Value: "+array[i]);
        }
    }

    public static int sum(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }

        return sum;
    }

    public static int[] sortACS(int[] array){
        int[] sortedArray = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            sortedArray[index] = array[index];
        }

        boolean flag = true;
        while(flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                for (int j = i+1; j < sortedArray.length; j++) {
                    if(sortedArray[i]>sortedArray[j]){
                        int temp = sortedArray[i];
                        sortedArray[i] = sortedArray[j];
                        sortedArray[j] = temp;
                        flag = true;

                    }
                }
            }
        }
        return sortedArray;
    }

    
    public static void main(String[] args) {
        int[] ints = getIntegers(5);
        printArray(ints);
      
        // Arrays.sort(ints);
        
        printArray(sortACS(ints));
        
    }
}
