package Drawing;

import javax.swing.*;

/**
 * Created by Wiktoria on 08.03.2017.
 */
public class DrawInFrame extends JFrame
{
    public DrawInFrame()
    {
        super("Draw me like on of your Java girls");
        JPanel panel = new MyPanel();
        add(panel);

//        setSize(800, 600);
        pack(); // sets preferred size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(50, 50);
    }
}
