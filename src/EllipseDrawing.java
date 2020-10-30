import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.List;

public class EllipseDrawing extends Shapes
{
	private Color color;
    private Ellipse shape;

    public EllipseDrawing()
    {
        this.shape = new Ellipse();
    }

    @Override
    public void drawing(Graphics g)
    {
        g.setColor(color);
        Ellipse2D ellipse = new Ellipse2D.Double();
        ellipse.setFrameFromDiagonal(shape.getX0(), shape.getY0(), shape.getX1(), shape.getY1());
        g.drawOval((int) ellipse.getX(), (int) ellipse.getY(), (int) ellipse.getWidth(), (int) ellipse.getHeight());
    }

    @Override
    public Color getColor()
    {
        return this.color;
    }

    @Override
    public String getType()
    {
        return "Ellipse";
    }

    @Override
    public List<Point2D> getCoords()
    {
        return shape.getPoints();
    }

    @Override
    public void setColor(Color color)
    {
        this.color = color;
    }
    
    @Override
    public void setCoords(List<Point2D> point)
    {
        addCoordN(point.get(0));
        addCoordO(point.get(1));
    }

	@Override
	public Shape getShape()
    {
        return this.shape;
    }

	@Override
	public void addCoordN(Point2D point)
	{
		this.shape.addCoordN(point);
	}

	@Override
	public void addCoordO(Point2D point)
	{
		this.shape.addCoordO(point);
	}

	@Override
	public void addCoordD(Point2D point)
	{
		this.shape.addCoordD(point);
	}
}