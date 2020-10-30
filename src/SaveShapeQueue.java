import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SaveShapeQueue implements Serializable
{
    private static final long serialVersionUID = 1L;
    private List<SaveShape> shapes;
    public SaveShapeQueue()
    {
        shapes=new ArrayList<SaveShape>();
    }

    public void addShape(SaveShape saveShape) 
    {
        shapes.add(saveShape);
    }

    public List<SaveShape> getShapes()
    {
        return shapes;
    }
}
