package PaSkCode;
import java.awt.*;
import java.util.Iterator;
import java.util.ListIterator;

public class PSysView {


    PSysView() {

    }

    // draw all particles in psm
    void draw(PSysModel psm, Graphics g) {

        int px = psm.getCurrentParticleX();
        int py = psm.getCurrentParticleY();
        int radius = psm.getCurrentParticleRad();

        Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHints(
                    new RenderingHints(RenderingHints.KEY_TEXT_ANTIALIASING,
                            RenderingHints.VALUE_TEXT_ANTIALIAS_ON));
            g2d.setColor(Color.RED);
            //todo: to draw the circle with the data
            g2d.fillOval(px - radius, py - radius, radius * 2, radius * 2);

    }

    // dump information on all particles in psm
    void dump(PSysModel psm, int lc) {
	    System.out.println("Frame " + lc);
        //todo:  figure out the whats radius etc
	    //System.out.println(radius + " " + px + " " + py + " " + velX + " " + velY);
    }
}
