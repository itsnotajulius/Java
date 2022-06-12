package OOP.Encapsulation.Player;

public class Player {
    public String name;
    public int health;

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player is died");
        }
    }

    public int remainHealth() {
        return this.health;
    }
}
