import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Queue implements Serializable
{
	private List<Shapes> listShapes;
	private Color color;
	
	Queue()
	{
		listShapes = new ArrayList<Shapes>();
		color = Color.black;
	}
	
	public void addShape(Shapes shape)
	{
		
		shape.setColor(color);
		listShapes.add(shape);
	}
	
	public void printTo(Graphics buffer)
	{
		for (Shapes shape: listShapes)
		{
			if(shape.getShape() != null)
			{
				shape.drawing(buffer);
			}
		}	
	}
	
	public Shapes getLast()
	{
		if(listShapes.size() == 0)
		{
			return null;
		}
		return listShapes.get(listShapes.size() - 1);
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	public void refresh()
	{
		this.listShapes.clear();
	}
	
	public List<Shapes> getQueue()
	{
		return this.listShapes;
	}
	
}
