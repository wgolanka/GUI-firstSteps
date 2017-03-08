package IncludingPictures;

import javax.swing.*;

/**
 * Created by Wiktoria on 08.03.2017.
 */
public class PictureFrame extends JFrame
{
    public PictureFrame()
    {
        super("Cuteness therapy");

        JPanel picturePanel = new PicturePanel();
        add(picturePanel);

        pack(); // pack adjust size of a frame to a size of a picture that I used
//        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(50, 50);
        setVisible(true);
    }
}
