import java.awt.*;
import java.awt.geom.Point2D;
import java.util.List;

public class PolygonDrawing extends Shapes
{
    private Color color;
    private Polygon shape;

    public PolygonDrawing()
    {
        this.shape = new Polygon();
    }

    @Override
    public void drawing(Graphics g)
    {
        g.setColor(color);
        g.drawPolygon(shape.getX(), shape.getY(), shape.size());
    }

    @Override
    public Color getColor()
    {
        return this.color;
    }

    @Override
    public String getType()
    {
        return "Polygon";
    }

    @Override
    public void setColor(Color color)
    {
        this.color = color;
    }

	@Override
	public Shape getShape()
	{
		return this.shape;
	}

	@Override
	public List<Point2D> getCoords()
	{
		return shape.getPoints();
	}

	@Override
	public void setCoords(List<Point2D> point)
	{
		for(int i = 0 ; i < point.size(); i++)
        {
			addCoordN(point.get(i));
        }
	}

	@Override
	public void addCoordN(Point2D point)
	{
		this.shape.addCoordN(point);
	}

	@Override
	public void addCoordO(Point2D coord)
	{
	        this.shape.addCoordN(coord);
	}

	@Override
	public void addCoordD(Point2D point)
	{
		this.shape.addCoordD(point);
	}
}