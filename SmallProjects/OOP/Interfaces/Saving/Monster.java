package src.Interfacess.Saving;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int health;

////////////////////////////////////////////////////////////////////////////////////////////////

    public Monster(String name, int health) {
        this.name = name;
        this.health = health;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getHealth() {
        return health;
    }


    public void setHealth(int health) {
        this.health = health;
    }


    


////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public String toString() {
        return "Monster [health=" + health + ", name=" + name + "]";
    }


    @Override
    public void read(List<String> savedValues) {
        if(savedValues!=null && savedValues.size()>0){
            this.name = savedValues.get(0);
            this.health = Integer.parseInt(savedValues.get(1));
        }
        
    }


    


    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, ""+this.health);

        return values;
    }
    
}
