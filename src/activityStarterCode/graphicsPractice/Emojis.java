package activityStarterCode.graphicsPractice;

import comp127graphics.Arc;
import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;
import comp127graphics.GraphicsGroup;
import comp127graphics.Rectangle;

import java.awt.*;

@SuppressWarnings("WeakerAccess")
public class Emojis {
    private static final Color
        HEAD_COLOR = new Color(0xCDFF0F),
        HEAD_OUTLINE_COLOR = new Color(0xF1EBE72D, true),
        MOUTH_COLOR = new Color(0xE45B5B);

    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Emoji", 800, 600);

        GraphicsGroup littleSmiley = createSmileyFace(100);
        littleSmiley.setPosition(50, 400);
        canvas.add(littleSmiley);

        GraphicsGroup mediumSmiley = createSmileyFace(200);
        mediumSmiley.setPosition(150, 300);
        canvas.add(mediumSmiley);

        GraphicsGroup bigSmiley = createSmileyFace(300);
        bigSmiley.setPosition(350, 200);
        canvas.add(bigSmiley);
    }

    /**
     * Creates a smiley face emoji.
     *
     * @param size The overall width and height of the emoji.
     * @return A graphic that you can add to a window, or place inside some other graphics group.
     */
    public static GraphicsGroup createSmileyFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        Rectangle leftLeg = createLegs(size*.05, size*.2);
        Rectangle rightLeg = createLegs(size*.05, size*.2);
        leftLeg.setCenter(size*.1, size*.9);
        rightLeg.setCenter(size*.9, size*.9);
        group.add(leftLeg);
        group.add(rightLeg);

        group.add(createHead(size, size));

        // TODO: create eyes
        Ellipse lefteye = createEyes(size*.2, size*.2);
        Ellipse righteye = createEyes(size*.2, size*.2);
        lefteye.setCenter(size*.2, size*.1);
        righteye.setCenter(size*.8, size*.1);
        group.add(lefteye);
        group.add(righteye);

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;
    }

    /**
     * Creates an empty emoji head. The head fits inside the box from (0,0)
     * to (width,height).
     */

    private static Ellipse createEyes(double height, double width){
        Ellipse eye = new Ellipse(0,0, width,height);
        eye.setFillColor(Color.BLACK);
        return eye;
    }

    private static Rectangle createLegs(double height, double width){
        Rectangle leg = new Rectangle(0,0,width,height);
        leg.setFillColor(HEAD_COLOR);
        leg.setStrokeColor(HEAD_OUTLINE_COLOR);
        return leg;
    }

    private static Ellipse createHead(double height, double width) {
        Ellipse head = new Ellipse(0, 0, width, height);
        head.setFillColor(HEAD_COLOR);
        head.setStrokeColor(HEAD_OUTLINE_COLOR);
        head.setStrokeWidth(2);
        return head;
    }

    /**
     * Creates a smile-shaped arc. The arc is measured relative to its “implied ellipse,” which is
     * the shape that would be formed if the arc were extend all the way around. The size of the
     * resulting arc will be smaller than the implied ellipse’s size.
     *
     * @param ellipseWidth  The width of the implied ellipse from which the smile’s arc is cut.
     * @param ellipseHeight The width of the implied ellipse from which the smile’s arc is cut.
     */
    private static Arc createSmile(double ellipseWidth, double ellipseHeight) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, 200, 140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(10);
        return mouth;
    }
}
