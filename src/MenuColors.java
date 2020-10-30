import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class MenuColors extends JPanel
{
	public MenuColors(Parameters parameters, Bibigalo biba)
	{
		GridLayout layout = new GridLayout(40, 1);
		layout.setVgap(0);
		super.setLayout(layout);
		this.setBounds(0, parameters.getButtonSize(), parameters.getButtonSize(), parameters.getOknoHeight());
		
		for (int i = 0; i <= 255; i += 51)
		{
			for (int j = 0; j <= 255; j += 51)
			{
				for (int k = 0; k <= 255; k += 51)
				{
					this.add(new ColorButton(new Color(i, j, k), biba));
				}
			}
		}
	}
}
