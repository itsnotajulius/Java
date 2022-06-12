package OOP.Composion.Pc;

public class Car extends Vehicle {

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

    /**
     * @return int return the doors
     */
    public int getDoors() {
        return doors;
    }

    /**
     * @param doors the doors to set
     */
    public void setDoors(int doors) {
        this.doors = doors;
    }

    /**
     * @return int return the engineCapacity
     */
    public int getEngineCapacity() {
        return engineCapacity;
    }

    /**
     * @param engineCapacity the engineCapacity to set
     */
    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

}
