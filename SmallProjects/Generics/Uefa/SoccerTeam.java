package Generics.Uefa;

public class SoccerTeam extends Player {
    public SoccerTeam(String name) {
        super(name);
    }

    public String toString() {
        return "SoccerTeam: " + this.getName();
    }
}
