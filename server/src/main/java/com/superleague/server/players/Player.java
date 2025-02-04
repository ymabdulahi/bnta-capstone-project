package com.superleague.server.players;


import javax.persistence.*;
import java.util.Objects;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "players")
public class Player {

    @Id
    private Long id;
    private String name;
    private String photo;
    private String teamName;
    private int appearances;
    private int goals;
    private int assists;
    private int yellows;
    private int reds;
    private int conceded;
    private String position;
    private int totalPoints;
    private int weeklyPoints;
    private String leagueName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getAppearances() {
        return appearances;
    }

    public void setAppearances(int appearances) {
        this.appearances = appearances;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getYellows() {
        return yellows;
    }

    public void setYellows(int yellows) {
        this.yellows = yellows;
    }

    public int getReds() {
        return reds;
    }

    public void setReds(int reds) {
        this.reds = reds;
    }

    public int getConceded() {
        return conceded;
    }

    public void setConceded(int conceded) {
        this.conceded = conceded;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getWeeklyPoints() {
        return weeklyPoints;
    }

    public void setWeeklyPoints(int weeklyPoints) {
        this.weeklyPoints = weeklyPoints;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && appearances == player.appearances && goals == player.goals && assists == player.assists && yellows == player.yellows && reds == player.reds && conceded == player.conceded && totalPoints == player.totalPoints && weeklyPoints == player.weeklyPoints && Objects.equals(name, player.name) && Objects.equals(photo, player.photo) && Objects.equals(teamName, player.teamName) && Objects.equals(position, player.position) && Objects.equals(leagueName, player.leagueName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, photo, teamName, appearances, goals, assists, yellows, reds, conceded, position, totalPoints, weeklyPoints, leagueName);
    }
}
