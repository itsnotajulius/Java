package Random.PoundtoKilogram.src;

public class PoundtoKilo {
    public static void main(String[] args) throws Exception {
        double rateKilo = 0.45359237d;
        double numOfPounds = 200d;
        double convertedKilos = numOfPounds * rateKilo;

        System.out.println("Converted Kilos: " + convertedKilos);
    }
}
