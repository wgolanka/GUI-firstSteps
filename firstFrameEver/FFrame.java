package firstFrameEver;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Wiktoria on 15.02.2017.
 */

public class FFrame extends JFrame
{
    public FFrame()
    {
        super("It's been a long semester...");
        //close when clicking X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        centreWindow(this);
        setVisible(true);
        setResizable(false); // can't change a size of a frame by a mouse

        setLayout(new FlowLayout());
//        setLayout(new GridLayout(3, 3));  just checked another layout
        add(new JButton("#1 Button"));
        add(new JButton("#2 Button"));
        add(new JButton("#3 Button"));

    }

    public static void centreWindow(Window frame)
    {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
}


