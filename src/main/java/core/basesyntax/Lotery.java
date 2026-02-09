package core.basesyntax;

import java.util.Random;

public class Lotery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();

        ball.setColor(colorSupplier.getRandomColor().toString());
        ball.setNumber(random.nextInt(101));
        return ball;
    }
}
