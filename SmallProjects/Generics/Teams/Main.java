package Generics.Teams;

public class Main {
    public static void main(String[] args) throws Exception {
        FootballPlayer joe = new FootballPlayer("joe");
        SoocerPlayer pat = new SoocerPlayer("pat");
        BaseballPlayer beck = new BaseballPlayer("beck");
        FootballPlayer banks = new FootballPlayer("Gordon");

        Team<FootballPlayer> fTeam = new Team<>("Fteam");
        fTeam.addPlayer(joe);
        // Ateam.addPlayer(pat);
        // Ateam.addPlayer(beck);

        System.out.println(fTeam.numPlayers());

        Team<BaseballPlayer> bTeam = new Team<>("Bteam");
        bTeam.addPlayer(beck);

        Team<SoocerPlayer> brokenTeam = new Team<>("Wont work");
        brokenTeam.addPlayer(pat);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");

        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(fTeam, 3, 8);

        fTeam.matchResult(fremantle, 2, 1);
        // fTeam.matchResult(bTeam, 1, 1); - Wont work due to type mismatch

        System.out.println("Rankings");
        System.out.println(fTeam.getName() + ": " + fTeam.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());

        System.out.println(hawthorn.compareTo(fremantle));
        System.out.println(fremantle.compareTo(hawthorn));

    }
}
