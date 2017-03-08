package IncludingPictures;

import java.awt.*;

/**
 * Created by Wiktoria on 08.03.2017.
 */
public class Test
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new PictureFrame();
            }
        });
    }
}
