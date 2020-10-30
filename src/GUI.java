import javax.swing.*;

public class GUI extends JFrame
{
	public GUI(Parameters parameters, Bibigalo biba)
	{
		super("ÃĞÀÔÈ×ÅÑÊÈÉ ĞÅÄÀÊÒÎĞ");
		this.setVisible(true);
		//setLocationByPlatform(true);
		this.setBounds(parameters.getScreenSize().width/4, parameters.getScreenSize().height/4, parameters.getScreenSize().width/2, parameters.getScreenSize().height/2);
		this.add(new Menu(parameters, biba, this));
		this.add(new MenuInstruments(parameters, biba));
		this.add(new MenuColors(parameters, biba));
		this.add(new Canvas(parameters, biba, this));
	}
}
