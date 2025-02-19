package main.java.org.example;

public class Geography {
    int rCoord;
    int cCoord;
    int[][] geography = { 
        {1000, 300, 500, 600, 1500},
        {500, 600, 400, 200, 2000},
        {3000, 200, 100, 700, 800},
        {100, 300, 100, 600, 1500},
        {100, 400, 500, 300, 5000},
    };

    int numTaller = 0;
    int numLower = 0;

    String targetFormation = "";

    public Geography(int rCoord, int cCoord) {
        this.rCoord = rCoord;
        this.cCoord = cCoord;
    }

    public String checkFormation() {
        // can assume nothing on the sides :)

        int targetElevation = geography[rCoord][cCoord];
        // left
        if (targetElevation < geography[rCoord][cCoord - 1]) {
            numTaller++;
        } else {
            numLower++;
        }
        // right
        if (targetElevation < geography[rCoord][cCoord + 1]) {
            numTaller++;
        } else {
            numLower++;
        }
        // above
        if (targetElevation < geography[rCoord + 1][cCoord]) {
            numTaller++;
        } else {
            numLower++;
        }
        // below
        if (targetElevation < geography[rCoord - 1][cCoord]) {
            numTaller++;
        } else {
            numLower++;
        }

        // peak = all 4 lower
        // basin = all 4 higher
        // ridge = higher than 3, lower than 1
        // valley = lower than 3, higher than 1
        // slope = lower than 2, higher than 2

        if (numTaller == 4) {
            return "BASIN";
        } else if (numLower == 4) {
            return "PEAK";
        } else if (numTaller == 1 && numLower == 3) {
            return "RIDGE";
        } else if (numLower == 1 && numTaller == 3) {
            return "VALLEY";
        } else if (numLower == 2 && numTaller == 2) {
            return "SLOPE";
        }

        return "ERROR";
    }

    public int getTaller() {
        return numTaller;
    }

    public int getLower() {
        return numLower;
    }

    public int getElevation() {
        return geography[rCoord][cCoord];
    }

}
