package lesson0208;

import java.util.Random;

class Glassbowl {
    private int initialBallCount;
    private Lotteryball[] allBalls = new Lotteryball[45];


    Glassbowl(int initialBallCount) {
        this.initialBallCount = initialBallCount;
    }

    void collectAllBalls() {
        for (int i = 0; i < 45; i++) {
            allBalls[i] = new Lotteryball(i + 1);
        }
    }

    Lotteryball collectBall() {
        Random rnd = new Random();
        int rndnumber = rnd.nextInt(44);
        if (allBalls[rndnumber] != null) {
            Lotteryball ball = allBalls[rndnumber];
            allBalls[rndnumber] = null;
            return ball;
        } else {
            rndnumber = rnd.nextInt(44);
            Lotteryball ball = allBalls[rndnumber];
            allBalls[rndnumber] = null;
            return ball;
        }
    }
}