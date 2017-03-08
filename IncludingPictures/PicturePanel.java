package IncludingPictures;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Wiktoria on 08.03.2017.
 */
public class PicturePanel extends JPanel
{
    private BufferedImage image;
    private BufferedImage image2;
    private BufferedImage imageURL;

    public PicturePanel()
    {
        super();

        File imageFile = new File(
                "C:\\Users\\Wikusia\\IdeaProjects\\GUI_FirstSteps\\" +
                        "src\\IncludingPictures\\pictures\\Kittens.jpg");
        File image2File = new File(
                "C:\\Users\\Wikusia\\IdeaProjects\\GUI_FirstSteps\\" +
                        "src\\IncludingPictures\\pictures\\Monkeys.jpg");
        URL imageFileURL;

        try
        {
            imageFileURL = new URL(
                    "http://i.dailymail.co.uk/i/pix/2009/" +
                            "01/15/article-0-03112F1E000005DC-575_468x286.jpg");

            image = ImageIO.read(imageFile);
            image2 = ImageIO.read(image2File);
            imageURL = ImageIO.read(imageFileURL);
        }
        catch(IOException e)
        {
            System.out.println("Image not found");
            e.printStackTrace();
        }

//        Dimension dimension = new Dimension(image.getWidth(), image.getHeight());
//        adjusted to more images
        Dimension dimens = new Dimension((image.getWidth() + image2.getWidth()),
                                         image.getHeight());
        setPreferredSize(dimens);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image, 0, 0, this);
        g2D.drawImage(image2, image.getWidth(), 0, this);
        g2D.drawImage(imageURL, image.getWidth(), image2.getHeight(), this);
    }
}
