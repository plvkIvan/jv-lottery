package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final static int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();

        ball.setColor(colorSupplier.getRandomColor().name());
        ball.setNumber(random.nextInt(MAX_NUMBER));
        return ball;
    }
}
