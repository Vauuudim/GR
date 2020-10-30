import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class EllipseButton extends JButton
{
	public EllipseButton(Bibigalo biba)
	{
		//super("›ÀÀ»œ—");
        super(new ImageIcon("Elips1.png"));
        this.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            	biba.addShape(new EllipseDrawing());
            }
        });
    }
}
