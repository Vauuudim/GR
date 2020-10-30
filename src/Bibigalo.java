import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.util.List;

public class Bibigalo
{
	private Queue queue;
	private BufferedImage buferImage;
	private Graphics bufer;
	private Parameters pamParam;
	
	public Bibigalo(Parameters parameters)
	{
		queue = new Queue();
		pamParam = parameters;
		//buferImage = new BufferedImage(parameters.getOknoWidth(), parameters.getOknoHeight(), BufferedImage.TYPE_INT_ARGB);
		buferImage = new BufferedImage(parameters.getScreenSize().width, parameters.getScreenSize().height, BufferedImage.TYPE_INT_ARGB);
		bufer = buferImage.getGraphics();
		bufer.setColor(new Color(255, 255, 255));
		//bufer.fillRect(0, parameters.getButtonSize(), parameters.getOknoWidth(), parameters.getOknoHeight());
		bufer.fillRect(parameters.getButtonSize(), parameters.getButtonSize(), parameters.getScreenSize().width, parameters.getScreenSize().height);
	}
	
	public BufferedImage getBuferImage()
	{
		bufer.setColor(Color.white);
		bufer.fillRect(pamParam.getButtonSize(), pamParam.getButtonSize(), pamParam.getScreenSize().width, pamParam.getScreenSize().height);
		queue.printTo(bufer);
		return buferImage;
	}
	//Координаты при нажатии мыши
	public void addCoordN(Point2D point)
	{
		if((point.getX() >= pamParam.getButtonSize()) && (point.getY() >= pamParam.getButtonSize()))
        {
        	queue.getLast().addCoordN(point);
            //notifyObservers();
        }
    }
	//Координаты при отпускании мыши
    public void addCoordO(Point2D point)
    {
        if((point.getX() >= pamParam.getButtonSize()) && (point.getY() >= pamParam.getButtonSize()))
        {
        	queue.getLast().addCoordO(point);
            //notifyObservers();
        }
    }
    //Координаты при движении мыши
    public void addCoordD(Point2D point)
    {
    	if((point.getX() >= pamParam.getButtonSize()) && (point.getY() >= pamParam.getButtonSize()))
        {
        	queue.getLast().addCoordD(point);
            //notifyObservers();
        }
    }

	public Shapes getLast()
	{
		return queue.getLast();
	}

	public void addShape(Shapes shape)
	{
		queue.addShape(shape);
	}

	public void setColor(Color color)
	{
		queue.setColor(color);
	}
	
	public List<Shapes> getQueue()
	{
		return queue.getQueue();
	}

	public void refresh()
	{
		this.queue.refresh();
	}
}
