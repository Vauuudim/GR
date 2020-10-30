import java.awt.*;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ellipse implements Shape, Serializable
{
    private int x0, y0, x1, y1;
    private List<Point2D> coords;

    public Ellipse()
    {
        coords = new ArrayList<Point2D>();
    }

    public int getX0()
    {
        return this.x0;
    }

    public int getX1()
    {
        return this.x1;
    }

    public int getY0()
    {
        return this.y0;
    }

    public int getY1()
    {
        return this.y1;
    }

    public void addCoordN(Point2D point)
    {
        coords.add(point);
        this.x0 = (int) point.getX();
        this.y0 = (int) point.getY();
    }

    public void addCoordO(Point2D point)
    {
        coords.add(point);
        this.x1 = (int) point.getX();
        this.y1 = (int) point.getY();
    }

    public void addCoordD(Point2D point)
    {
        this.x1 = (int) point.getX();
        this.y1 = (int) point.getY();
    }

    public int size()
    {
        return 0;
    }

    public List<Point2D> getPoints()
    {
        return this.coords;
    }

    @Override
    public Rectangle2D getBounds2D()
    {
        return null;
    }

    @Override
    public boolean contains(double x, double y)
    {
        return false;
    }

    @Override
    public boolean contains(Point2D p)
    {
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h)
    {
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r)
    {
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h)
    {
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r)
    {
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at)
    {
        return null;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness)
    {
        return null;
    }

	@Override
	public Rectangle getBounds()
	{
		return null;
	}
}