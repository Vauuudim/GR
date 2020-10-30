import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PolylineButton extends JButton
{
    public PolylineButton(Bibigalo biba)
    {
        //super("PolyLine");
        super(new ImageIcon("PolyLine1.png"));
        this.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                biba.addShape(new PolylineDrawing());
            }
        });
    }
}
