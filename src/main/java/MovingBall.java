import processing.core.PApplet;

import java.awt.*;

public class MovingBall extends PApplet {

    public static final int BACKGROUND_COLOR = 100;

    public static void main(String[] args) {
        PApplet.main("MovingBall", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(getScreenSize().width/2, getScreenSize().height/2);
    }

    private Dimension getScreenSize() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }

    @Override
    public void setup() {
        drawBackground(0);
        int xCoordinate = getScreenSize().width / 4;
        int yCoordinate = getScreenSize().height / 4;
        ellipse(xCoordinate, yCoordinate, 100, 100);
    }

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
        ellipse(mouseX,100,100,100 );
    }

    private void drawBackground(int backgroundColor) {
        background(backgroundColor);
    }

}
