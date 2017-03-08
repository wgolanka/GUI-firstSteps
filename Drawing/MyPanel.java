package Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by Wiktoria on 08.03.2017.
 */
public class MyPanel extends JPanel
{
    public MyPanel()
    {
        setPreferredSize(new Dimension(600, 400));
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D)g;

//        draw rectangle
        Rectangle2D rectangle = new Rectangle2D.Double(60, 60, 200, 200);
        Rectangle2D smallerRec = new Rectangle2D.Double(90, 90, 140, 140);
//        g2D.drawRect(40, 40, 60, 60); another way, read that's less object-oriented

//        draw oval
        Ellipse2D circle = new Ellipse2D.Double(60, 60, 200, 200);
//        g2D.drawOval(40, 40, 60, 60);

        g2D.draw(rectangle);
        g2D.draw(circle);
        g2D.draw(smallerRec);
    }
}
