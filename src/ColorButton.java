import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ColorButton extends JButton
{
	public ColorButton(Color color, Bibigalo biba)
	{
        this.setBackground(color);
        this.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            	if (biba.getLast() != null) {
                    biba.getLast().setColor(color);
                }
                biba.setColor(color);
            }
        });
    }
}
