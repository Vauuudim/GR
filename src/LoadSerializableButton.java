import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JMenuItem;

public class LoadSerializableButton extends JMenuItem
{
	public LoadSerializableButton(Bibigalo biba, GUI gui)
	{
		super("«¿√–”«»“‹ ‘¿…À");
        this.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            	SaveShapeQueue shapes = new SaveShapeQueue();
                FileInputStream fileInputStream;
				try {
					fileInputStream = new FileInputStream("save.ser");
					try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
	                {
	                    shapes = (SaveShapeQueue) objectInputStream.readObject();
	                    biba.refresh();
	                    for (SaveShape saveShape: shapes.getShapes())
	                    {
	                        biba.setColor(saveShape.getColor());
	                        if(saveShape.getType().equals("Ellipse"))
	                        {
	                        	biba.addShape(new EllipseDrawing());
	                        }
	                        else if (saveShape.getType().equals("Rectangle"))
	                        {
	                        	biba.addShape(new RectangleDrawing());
	                        }
	                        else if (saveShape.getType().equals("Polygon"))
	                        {
	                        	
	                        	biba.addShape(new PolygonDrawing());
	                        }
	                        else if (saveShape.getType().equals("Polyline"))
	                        {
	                        	biba.addShape(new PolylineDrawing());
	                        }
	                        else throw new RuntimeException("problem");
	                        if(saveShape.getPoints().size() != 0)
	                        {
	                        	biba.getLast().setCoords(saveShape.getPoints());
	                        }
	                    }
	                    gui.repaint();
	                } catch (IOException e1)
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ClassNotFoundException e1)
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (FileNotFoundException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                
            }
        });
	}
}