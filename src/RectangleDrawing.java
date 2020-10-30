import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.util.List;

public class RectangleDrawing extends Shapes
{
    private Color color;
    private Rectangle shape;

    public RectangleDrawing() {
        this.shape = new Rectangle();
    }

    @Override
    public void drawing(Graphics g)
    {
        g.setColor(color);
        Rectangle2D rectangle = new Rectangle2D.Double();
        rectangle.setFrameFromDiagonal(shape.getX0(), shape.getY0(), shape.getX1(), shape.getY1());
        g.drawRect((int) rectangle.getX(), (int) rectangle.getY(), (int) rectangle.getWidth(), (int) rectangle.getHeight());
    }

    @Override
    public Color getColor()
    {
        return this.color;
    }

    @Override
    public String getType()
    {
        return "Rectangle";
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