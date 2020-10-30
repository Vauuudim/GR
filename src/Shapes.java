import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.io.Serializable;
import java.util.List;

public abstract class Shapes implements Serializable
{
	
	//Получаем фигуру
    abstract public Shape getShape();
    //Получаем цвет для фигуры
    abstract public Color getColor();
    //Получаем тип фигуры
    abstract public String getType();
    //Получаем координаты для фигуры
    abstract public List<Point2D> getCoords();
    //Устанавливаем цвет для фигуры
	abstract public void setColor(Color color);
	//Размещаем фигуру по координатам
    abstract public void setCoords(List<Point2D> point);
    //Рисуем фигуру
  	abstract public void drawing(Graphics g);
  	
    //Координаты при нажатии мыши
    abstract public void addCoordN(Point2D point);
    //Координаты при отпускании мыши
    abstract public void addCoordO(Point2D point);
    //Координаты при движении мыши
    abstract public void addCoordD(Point2D point);
    
}
