import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * A component that draws a picture with at least 5 shape objects.
 */
public class HelloGraphicsComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        Rectangle rect = new Rectangle(255, 255, 200, 100);
        g2.setColor(Color.cyan);
        g2.fill(rect);

        g.drawLine(155, 300, 255,255);
        g.drawLine(155, 300,255, 355);
 
        g.drawLine(455, 255,555, 300);
        g.drawLine(455, 355,555, 300);



        g.setColor(Color.BLACK);

        Rectangle rects = new Rectangle(200, 20, 200, 100);
        g2.setColor(Color.BLACK);
        g2.fill(rects);
        Rectangle rectl = new Rectangle(300, 55, 55, 20);
        g2.setColor(Color.RED);
        g2.fill(rectl);
        g2.drawString("Television, Music, COVID mask, and space",  500, 20);

        Rectangle rectli = new Rectangle(235, 55, 50, 20);
        g2.setColor(Color.GREEN);
        g2.fill(rectli);

        int x = 100;
        int y = 100;
        int z = 140;
        int zz = 100;
        int zzz = 500;
        int yy = 100;
        int diameter = 25;
        int diameter2 = 170;

        g.drawLine(120,70, 120, 110);
        g.drawLine(160,70, 160, 110);
        g.drawLine(120,70, 160, 70);
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, diameter, diameter);
        g2.setColor(Color.GREEN);
        g2.setColor(new Color(0, 255, 0, 220));


        Ellipse2D.Double circles = new Ellipse2D.Double(z, zz, diameter, diameter);
        g2.setColor(Color.GREEN);
        g2.setColor(new Color(0, 255, 0, 200));

        Ellipse2D.Double circless = new Ellipse2D.Double(zzz, yy, diameter2, diameter2);
        g2.setColor(new Color(0, 255, 0, 255));
        g.drawLine(445,185, 730, 185);


        g2.fill(circles);
        g2.fill(circle);
        g2.fill(circless);
        g2.setColor(Color.BLACK);
        g2.drawString("NETFLIX", 300, 70);
        g2.drawString("HULU", 235, 70);
        g2.drawString("VENUS", 575, 185);
    } // end paintComponent

} // end class HelloGraphicsComponent
