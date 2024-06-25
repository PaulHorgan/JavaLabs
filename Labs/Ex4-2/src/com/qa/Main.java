package com.qa;

public class Main {
    public static void main(String[] args) {
        Team t1 = new Team("Celtic", "Parkhead", 60000);
        Team t2 = new Team("Partick Thistle", "Fir Hill", 10887);
        Team t3 = new Team("DAFC. (the Pars)", "East End Park", 11480);
        Team t4 = new Team ("Raith Rovers", "Starks Park", 8867);


        Team[] teamArray = new Team[4];

        teamArray[0] = t1;
        teamArray[1] = t2;
        teamArray[2] = t3;
        teamArray[4] = t4;

        for (
                int x = 0;
                x < teamArray.length;
                x++) {
            System.out.println(teamArray[x]);
        }
    }
}

