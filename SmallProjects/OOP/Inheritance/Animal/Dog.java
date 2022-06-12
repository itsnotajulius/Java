package OOP.Inheritance.Animal;

class shoes {

}

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int teeth, int tail, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    public void moveLegs() {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs();
        super.move(speed);
    }

    /**
     * @return int return the eyes
     */
    public int getEyes() {
        return eyes;
    }

    /**
     * @param eyes the eyes to set
     */
    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    /**
     * @return int return the legs
     */
    public int getLegs() {
        return legs;
    }

    /**
     * @param legs the legs to set
     */
    public void setLegs(int legs) {
        this.legs = legs;
    }

    /**
     * @return int return the teeth
     */
    public int getTeeth() {
        return teeth;
    }

    /**
     * @param teeth the teeth to set
     */
    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    /**
     * @return int return the tail
     */
    public int getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(int tail) {
        this.tail = tail;
    }

    /**
     * @return String return the coat
     */
    public String getCoat() {
        return coat;
    }

    /**
     * @param coat the coat to set
     */
    public void setCoat(String coat) {
        this.coat = coat;
    }

}
