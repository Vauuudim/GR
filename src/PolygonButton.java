import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PolygonButton extends JButton
{
	public PolygonButton(Bibigalo biba)
	{
		//super("œŒÀ»√ŒÕ");
        super(new ImageIcon("Polygon1.png"));
        this.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            	biba.addShape(new PolygonDrawing());
            }
        });
    }
}
