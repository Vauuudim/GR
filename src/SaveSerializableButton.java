import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JMenuItem;

public class SaveSerializableButton extends JMenuItem
{
	public SaveSerializableButton(Bibigalo biba)
	{
		super("—Œ’–¿Õ»“‹ ‘¿…À");
        this.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            	SaveShapeQueue queueShape = new SaveShapeQueue();
                for(Shapes shape: biba.getQueue())
                {
                    queueShape.addShape(new SaveShape(shape));
                }
                
				try {
					FileOutputStream outputStream = new FileOutputStream("save.ser");
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
	                objectOutputStream.writeObject(queueShape);
	                objectOutputStream.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                
            }
        });
	}
}
