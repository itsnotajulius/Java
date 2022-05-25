package src.mypack;


public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);


        Monitor theMoniter = new Monitor("27inch", "Samgs", 27, new Resolution(1080, 720));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2");

        PC thePc = new PC(theCase, theMoniter, theMotherboard);
        thePc.powerUp();
    }
}
