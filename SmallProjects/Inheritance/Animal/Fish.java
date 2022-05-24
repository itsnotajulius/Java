package mypack;


public class Fish extends Animal {
    
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name,  int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }



    
    public Fish(String name, int size, int weight, int gills, int eyes) {
        this(name, size, weight,gills,eyes,0);
    }


    Dog dogie = new DOg();
    dogie.

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }
    

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
