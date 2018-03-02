package lesson0208;

public class Lotterymachine {
    public void drawLottery() {
        Glassbowl bowl = new Glassbowl(45);
        Scoreboard score = new Scoreboard();

        bowl.collectAllBalls();
        score.emptyScore();

        for (int i = 0; i < 6; i++) {
            Lotteryball ball = bowl.collectBall();
            score.placeBall(ball);
        }

        Lotteryball ball = bowl.collectBall();
        score.placeBonusBall(ball);

        score.sortBalls();
        score.printScoreboard();
    }
}
