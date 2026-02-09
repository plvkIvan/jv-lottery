package core.basesyntax;

import java.util.Random;

public class Lotery {
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();

    public Ball getRandomBall(){
        Ball ball = new Ball();

        ball.color = colorSupplier.getRandomColor().toString();
        ball.number = random.nextInt(101);
        return ball;
    }
}
