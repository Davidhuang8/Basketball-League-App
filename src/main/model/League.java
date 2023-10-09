package model;

import java.util.*;

public class League {
    private List<Team> league;
    private String name;

    // EFFECTS: constructs a league with a name and empty list of teams
    public League(String name) {
        this.name = name;
        this.league = new ArrayList<>();
    }

    // MODIFIES: this
    // EFFECTS: adds team with given name to the league if team is not already in the league, return true if the add
    //          was successful, otherwise return false
    public void addTeam(Team team) {
        if (!league.contains(team)) {
            league.add(team);
        }
    }

    public String getLeagueName() {
        return name;
    }

    public int getAmountOfTeams() {
        return league.size();
    }

    public List<Team> getTeams() {
        return league;
    }
}
