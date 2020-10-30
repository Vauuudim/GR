import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.io.Serializable;
import java.util.List;

public abstract class Shapes implements Serializable
{
	
	//�������� ������
    abstract public Shape getShape();
    //�������� ���� ��� ������
    abstract public Color getColor();
    //�������� ��� ������
    abstract public String getType();
    //�������� ���������� ��� ������
    abstract public List<Point2D> getCoords();
    //������������� ���� ��� ������
	abstract public void setColor(Color color);
	//��������� ������ �� �����������
    abstract public void setCoords(List<Point2D> point);
    //������ ������
  	abstract public void drawing(Graphics g);
  	
    //���������� ��� ������� ����
    abstract public void addCoordN(Point2D point);
    //���������� ��� ���������� ����
    abstract public void addCoordO(Point2D point);
    //���������� ��� �������� ����
    abstract public void addCoordD(Point2D point);
    
}
