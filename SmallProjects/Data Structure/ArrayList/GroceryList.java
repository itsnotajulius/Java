package mypack.array;

import java.util.ArrayList;

public class GroceryList {
    
    private ArrayList<String> groceryList = new ArrayList<String>();


    

    public int listSize(){
        return groceryList.size();
    }

    public void addGrocItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+listSize()+ " items in your grocery list");
        for (int i = 0; i < listSize(); i++) {
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }

    public void modGrocItem(String newItem, String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            modGrocItem(position, newItem);
        }
    }

    private void modGrocItem(int pos, String newItem){
        if(listSize()>0 && pos>=0 && pos<=(listSize()-1)){
            groceryList.set(pos,newItem);
            System.out.println("Groxery Item: "+(pos+1)+" was modded.");
        }else{
            System.out.println("Pos "+pos+" isnt in this List to be modded");
        }
        
    }


    public void removeGrocItme(String newItem){
        int position = findItem(newItem);
        if(position>=0){
            removeGrocItme(position);
        }
    }


    private void removeGrocItme(int pos){
        if(listSize()>0 && pos>=0 && pos<=(listSize()-1)){
            groceryList.remove(pos);
        }else{
            System.out.println("Pos "+pos+" isnt in this List to be removed");
        }
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
        
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return true;
        }
        return false;
    }

    /**
     * @return ArrayList<String> return the groceryList
     */
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    /**
     * @param groceryList the groceryList to set
     */
    public void setGroceryList(ArrayList<String> groceryList) {
        this.groceryList = groceryList;
    }

}
