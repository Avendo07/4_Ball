import processing.core.PApplet;

import java.awt.*;

public class MovingBall extends PApplet {

    public static final int BACKGROUND_COLOR = 100;

    public static final int SCREEN_WIDTH = getScreenSize().width / 2;
    public static final int SCREEN_HEIGHT = getScreenSize().height / 2;
    public static final int RADIUS = 10;
    public int frame;

    public static void main(String[] args) {
        PApplet.main("MovingBall", args);
    }

    @Override                                                                                                           //Correction: Now used to set up the screen size and things related to the environment
    public void settings() {
        super.settings();
        size(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void setup() {                                                                                               //Used to declare variables and initalisation
        frame = 0;
        drawBackground();
    }

    @Override
    public void draw() {
        moveBall(1,1);
        moveBall(2,2);
        moveBall(3,3);
        moveBall(4,4);
        frame ++;
    }

    private void moveBall(float verticalPosition, int speed) {
        drawCircle(speed*frame, verticalPosition*SCREEN_HEIGHT/5);
    }

    private void drawCircle(float xCoordinate, float yCoordinate) {
        ellipse(xCoordinate, yCoordinate, MovingBall.RADIUS, MovingBall.RADIUS);
    }

    private static Dimension getScreenSize() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }

    private void drawBackground() {
        background(BACKGROUND_COLOR);
    }

}
