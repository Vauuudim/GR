import java.awt.GridLayout;
import javax.swing.JPanel;

public class MenuInstruments extends JPanel
{
	public MenuInstruments(Parameters parameters, Bibigalo biba)
	{
		//super("ШЭбвагЬХЭвл");
		//super(new FlowLayout(FlowLayout.LEFT));
		GridLayout layout = new GridLayout();
		super.setLayout(layout);
		this.setBounds(parameters.getButtonSize(), 0, parameters.getOknoWidth(), parameters.getButtonSize());
		this.add(new RectangleButton(biba));
		this.add(new EllipseButton(biba));
		this.add(new PolylineButton(biba));
		this.add(new PolygonButton(biba));
	}
}
