package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lotery lotery = new Lotery();

        Ball ball1 = lotery.getRandomBall();
        Ball ball2 = lotery.getRandomBall();
        Ball ball3 = lotery.getRandomBall();

        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());

    }
}
