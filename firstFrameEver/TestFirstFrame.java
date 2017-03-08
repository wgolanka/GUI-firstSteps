package firstFrameEver;

import java.awt.*;

/**
 * Created by Wiktoria on 15.02.2017.
 */
public class TestFirstFrame
{
    public static void main(String[] args)
    {
        //when using invokeLater  - a try catch isn't needed
        try
        {
            EventQueue.invokeAndWait(new Runnable()
            {
                @Override
                public void run()
                {
                    new FFrame();
                }
            });
        }
        catch(Exception e)
        {

        }
    }
}
