package ru.geekbrains.qa.java2.lesson1;

public class Team {
    private String name;
    private Player[] players;

    public Team(Player[] players, String name) {
        this.players = players;
        this.name = name;
    }
    public void showResults() {
        for (Player p : players) {
            System.out.println(p.getName() + " " + p.getSuccess());
        }
    }
    public void showResultsSuccess() {
        for (Player p : players) {
            if (p.getSuccess()) {
                System.out.println(p.getName());
            }
        }
    }
    public Player[] getPlayers() {
        return players;
    }

    public static void main(String[] args) {
        Player p1 = new Player("1");
        Player p2 = new Player("2");
        Player p3 = new Player("3");
        Player p4 = new Player("4");
        Player[] players = new Player[]{p1, p2, p3, p4};
        Team team = new Team(players, "Eagles");

        Prepyatstvie pp1 = new Prepyatstvie();
        Prepyatstvie pp2 = new Prepyatstvie();
        Prepyatstvie[] pps = new Prepyatstvie[]{pp1, pp2};
        Course c = new Course(pps);

        c.doIt(team);
        team.showResults();
        team.showResultsSuccess();
    }
}
