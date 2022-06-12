package Generics.Uefa;

public class Main {

    public static void main(String[] arrg) {

        League<Team<SoccerTeam>> uefaLeague = new League<>("Champions League");

        SoccerTeam john = new SoccerTeam("John");
        SoccerTeam messi = new SoccerTeam("Messi");
        SoccerTeam pq = new SoccerTeam("Pique");

        Team<SoccerTeam> barca = new Team<>("Barcelona");
        barca.addPlayer(john);
        barca.addPlayer(messi);
        barca.addPlayer(pq);
        barca.addPlayer(messi);
        barca.removePlayer(john);

        skipLine();

        SoccerTeam ben = new SoccerTeam("Ben");
        SoccerTeam modr = new SoccerTeam("Modr");
        SoccerTeam vinnie = new SoccerTeam("Vinnie");

        Team<SoccerTeam> real = new Team<>("Real Madrid");
        real.addPlayer(ben);
        real.addPlayer(modr);
        real.addPlayer(vinnie);

        skipLine();
        ;

        SoccerTeam cr7 = new SoccerTeam("CR7");

        Team<SoccerTeam> united = new Team<>("United");
        united.addPlayer(cr7);

        skipLine();

        uefaLeague.addTeam(real);
        uefaLeague.addTeam(barca);
        uefaLeague.addTeam(united);

        skipLine();

        barca.matchResult(real, 2, 1);
        barca.matchResult(real, 1, 1);
        barca.matchResult(real, 4, 1);
        barca.matchResult(real, 1, 1);
        barca.matchResult(real, 1, 4);
        barca.matchResult(united, 1, 4);

        skipLine();

        uefaLeague.showLeague();

    }

    public static void skipLine() {
        System.out.println("\n");
    }

}
