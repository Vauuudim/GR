import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.util.List;

public class PolylineDrawing extends Shapes
{
	private Color color;
    private Polyline shape;

    public PolylineDrawing()
    {
        this.shape = new Polyline();
    }

    @Override
    public void drawing(Graphics g)
    {
        g.setColor(color);
        g.drawPolyline(shape.getX(), shape.getY(), shape.size());
    }

    @Override
    public Color getColor()
    {
        return this.color;
    }

    @Override
    public String getType()
    {
        return "Polyline";
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
    public void setCoords(List<Point2D> coord)
    {
        for (int i = 0; i < coord.size(); i++)
        {
            addCoordN(coord.get(i));
        }
    }

    @Override
    public Shape getShape()
    {
        return this.shape;
    }

    @Override
    public void addCoordN(Point2D coord)
    {
        this.shape.addCoordN(coord);
    }

    @Override
    public void addCoordO(Point2D coord)
    {
        this.shape.addCoordN(coord);
    }

    @Override
    public void addCoordD(Point2D coord)
    {
        this.shape.addCoordD(coord);
    }
}
