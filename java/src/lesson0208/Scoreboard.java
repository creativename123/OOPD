package lesson0208;

import java.util.Arrays;

public class Scoreboard {
    private Lotteryball[] scoreboard = new Lotteryball[7];
    private int nextIndex = 0;

    void emptyScore() {
        Arrays.fill(scoreboard, null);
    }

    void placeBall(Lotteryball ball) {
        if (nextIndex < 6) {
            scoreboard[nextIndex] = ball;
            nextIndex = nextIndex + 1;
        }
    }

    void placeBonusBall(Lotteryball ball) {
        if (nextIndex == 6) {
            scoreboard[nextIndex] = ball;
            nextIndex = nextIndex + 1;
        }
    }

    void sortBalls() {

    }


    void printScoreboard() {
        for (int i = 0; i < 7; i++) {
            System.out.println(scoreboard[i].toString());
        }
    }
}
