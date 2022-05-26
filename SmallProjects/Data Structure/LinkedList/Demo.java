package src.mypack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] arg){
        LinkedList<String> places = new LinkedList<String>();
        places.add("Cape Town");
        places.addFirst("Heathfield");
        places.addLast("Joberg");
        places.addFirst("Sintrex");
        places.addLast("Apple City");
        
        String[] arr = (String[]) places.toArray(new String[0]);
        
        
        System.out.println(Arrays.toString(arr));

        places.sort(Comparator.naturalOrder());
        printList(places);
    }
        

    public static void printList(LinkedList<String> linkedList){
        ListIterator<String> i = linkedList.listIterator();
        
        while(i.hasNext()) {
            System.out.print("Now Visiting: "+i.next()+" \n"); 
        }
        System.out.println();
        
    }
}
