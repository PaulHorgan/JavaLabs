package com.qa;

public class Team {
    private String club;
    private String stadium;
    private int seats;
    public Team (String club, String stadium, int seats) {
        this.club = club;
        this.stadium = stadium;
        this.seats = seats;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Team = "+club+" plays at " + stadium +" seating " +seats + "!";
    }
}


