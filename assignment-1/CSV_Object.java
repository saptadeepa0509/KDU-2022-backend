package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSV_Object {

    String name;
    String team;
    String role;
    int matches;
    int runs;
    float average;
    float sr;
    int wickets;



    public CSV_Object(String name, String team, String role, String matches, String runs, String average, String sr, String wickets) {
        this.name = name;
        this.team = team;
        this.role = role;
        this.matches = Integer.parseInt(matches);
        this.runs = Integer.parseInt(runs);
        this.average = Float.parseFloat(average);
        this.sr = Float.parseFloat(sr);
        this.wickets = Integer.parseInt(wickets);
    }

    public int getWickets() {
        return wickets;
    }

    public String getTeam() {
        return team;
    }

    public int getMatches() {
        return matches;
    }

    public int getRuns() {
        return runs;
    }

    public float getAverage() {
        return average;
    }

    public float getSr() {
        return sr;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }



    @Override
    public String toString() {
        return "CSV_Object{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", role='" + role + '\'' +
                ", matches=" + matches +
                ", runs=" + runs +
                ", average=" + average +
                ", sr=" + sr +
                ", wickets=" + wickets +
                '}';
    }
}

