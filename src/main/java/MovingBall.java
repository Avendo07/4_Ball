import processing.core.PApplet;

import java.awt.*;

public class MovingBall extends PApplet {

    public static final int BACKGROUND_COLOR = 100;

    public static final int SCREEN_WIDTH = getScreenSize().width / 2;
    public static final int SCREEN_HEIGHT = getScreenSize().height / 2;

    public static void main(String[] args) {
        PApplet.main("MovingBall", args);
    }

    @Override                                             //Correction: Now used to setup the screen size and things related to the environment
    public void settings() {
        super.settings();
        size(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void setup() {                       //Used to declare variables and initalisation
        int xCoordinate = SCREEN_WIDTH / 2;
        int yCoordinate = SCREEN_HEIGHT / 2;

        drawBackground(BACKGROUND_COLOR);

        ellipse(xCoordinate, yCoordinate, 100, 100);
    }

    @Override
    public void draw() {
        ellipse(mouseX, 100, 100, 100);
    }

    private void drawBackground(int backgroundColor) {
        background(backgroundColor);
    }

    private static Dimension getScreenSize() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }

}
