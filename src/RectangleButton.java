import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class RectangleButton extends JButton
{
	public RectangleButton(Bibigalo biba)
	{
        //super("œ–ﬂÃŒ”√ŒÀ‹Õ» ");
		
        super(new ImageIcon("Rectangle1.png"));
        this.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            	biba.addShape(new RectangleDrawing());
            }
        });
    }
}
