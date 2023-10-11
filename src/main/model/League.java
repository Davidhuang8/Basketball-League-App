package model;

import java.util.*;

// represents a basketball league with a name and an empty list of teams
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
    // Code referenced from: https://github.students.cs.ubc.ca/CPSC210/ControlAndDataFlowProjects.git Hockey team
    // util package, HockeyTeam class, method: insert()
    public boolean addTeam(Team team) {
        for (Team t : league) {
            if (t.getTeamName().equals(team.getTeamName())) {
                return false;
            }
        }
        league.add(team);
        return true;
    }

    // MODIFIES: this
    // EFFECTS: removes a team with the given name, return true if removal was successful, otherwise return false
    // Code referenced from: https://github.students.cs.ubc.ca/CPSC210/ControlAndDataFlowProjects.git Hockey team
    // util package, HockeyTeam class, method: insert()
    public boolean removeTeam(String name) {
        for (Team t : league) {
            if (t.getTeamName().equalsIgnoreCase(name)) {
                league.remove(t);
                return true;
            }
        }
        return false;
    }

    // getters

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
