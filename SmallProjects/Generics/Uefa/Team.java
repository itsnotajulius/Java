package Generics.Uefa;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    String name;
    int won;
    int lose;
    int draw;

    ArrayList<T> members = new ArrayList<T>();

    public Team(String name) {
        this.name = name;
    }

    ///////////////////////////////////////////////////////////////////////////////////

    public void addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " already exists in " + this.name);
        } else {
            members.add(player);
            System.out.println(player.getName() + " added to team " + this.name);
        }
    }

    public void removePlayer(T player) {
        if (members.contains(player)) {
            members.remove(player);
            System.out.println(player.getName() + " is removed from team " + this.name);
        } else {
            System.out.println("Player " + player.getName() + " is not in team " + this.name);
        }

    }

    public void printPlayers() {
        System.out.println("Team " + this.name + " has the following players:");
        for (T player : members) {
            System.out.println(player.getName());
        }
    }

    public void matchResult(Team<T> opponet, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = "won";
        } else if (ourScore == theirScore) {
            draw++;
            message = "draw";
        } else {
            lose++;
            message = "lose";
        }

        if (opponet != null) {
            System.out.println(this.name + " " + message + " against " + opponet.name);
            opponet.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 3) + draw;
    }

    public int compareTo(Team<T> other) {
        if (this.ranking() > other.ranking()) {
            return -1;
        } else if (this.ranking() < other.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int numberOfPlayers() {
        return members.size();
    }

    public int getGoalDifference() {
        return this.won - this.lose;
    }

    ///////////////////////////////////////////////////////////////////////////////////

    public String getName() {
        return this.name;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getWon() {
        return this.won;
    }

    public int getLose() {
        return this.lose;
    }

    public int getDraw() {
        return this.draw;
    }

}
