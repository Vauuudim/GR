import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JMenuItem;

public class SaveButton extends JMenuItem
{
	public SaveButton(Bibigalo biba)
	{
		super("—Œ’–¿Õ»“‹  ¿–“»Õ ”");
        this.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                File outFile = new File("image.png");
                try
                {
					ImageIO.write(biba.getBuferImage(), "png", outFile);
				}
                catch (IOException e1)
                {
					e1.printStackTrace();
				}
            }
        });
	}
}
