package Generics.Uefa;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public void addTeam(T team) {
        if (league.contains(team)) {
            System.out.println(team.getName() + " already exists in " + this.name);
        } else {
            league.add(team);
            System.out.println(team.getName() + " added to league " + this.name);
        }
    }

    public void removeTeam(T team) {
        if (league.contains(team)) {
            league.remove(team);
            System.out.println(team.getName() + " is removed from league " + this.name);
        } else {
            System.out.println("Team " + team.getName() + " is not in league " + this.name);
        }

    }

    public void showLeague() {
        if (league != null) {
            Collections.sort(league);
            for (T team : league) {
                System.out.println(team.getName() + " : " + team.ranking());
            }
        }

    }

}
