import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Polyline implements Shape, Serializable
{
	private List<Integer> x, y;
    private List<Point2D> coords;


    public Polyline()
    {
        coords = new ArrayList<Point2D>();
        this.x = new ArrayList<Integer>();
        this.y = new ArrayList<Integer>();
    }

    public int[] getX()
    {
        int[] x = new int[this.x.size()];
        for (int i = 0; i < this.x.size(); i++)
        {
            x[i] = (int) this.x.get(i);
        }
        return x;
    }

    public int[] getY()
    {
        int[] y = new int[this.y.size()];
        for (int i = 0; i < this.y.size(); i++)
        {
            y[i] = (int)  this.y.get(i);
        }
        return y;
    }

    public void addCoordN(Point2D coord)
    {
        this.coords.add(coord);
        this.x.add((int) coord.getX());
        this.y.add((int) coord.getY());
    }

    public void addCoordD(Point2D coord) {
        this.coords.set(this.coords.size() - 1, coord);
        this.x.set(this.x.size() - 1, (int) coord.getX());
        this.y.set(this.y.size() - 1, (int) coord.getY());
    }

    public int size()
    {
        return this.x.size();
    }

    public List<Point2D> getPoints()
    {
        return this.coords;
    }

    @Override
    public Rectangle getBounds()
    {
        return null;
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
	public PathIterator getPathIterator(AffineTransform at) {
		return null;
	}

	@Override
	public PathIterator getPathIterator(AffineTransform at, double flatness) {
		return null;
	}

}
