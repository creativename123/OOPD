package lesson0208;

public class Lotteryball {
    private int ballNumber;

    Lotteryball(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public boolean isBiggerThan(Lotteryball ball) {
        return ballNumber > ball.ballNumber;
    }

    public String toString() {
        return "" + ballNumber;
    }
}
