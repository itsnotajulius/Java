package OOP.Encapsulation.Player;

public class App {
    public static void main(String[] args) throws Exception {
        EnhancedPlayer player = new EnhancedPlayer("Julius", 200, "Batarang");
        System.out.println("Health is " + player.remainHealth());
    }
}
