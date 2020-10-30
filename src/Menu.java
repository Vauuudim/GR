import javax.swing.JMenuBar;

public class Menu extends JMenuBar
{
	public Menu(Parameters parameters, Bibigalo biba, GUI gui)
	{
		//this.setBounds(0, 0, parameters.getScreenSize().width, parameters.getButtonSize());
		this.setBounds(0, 0, parameters.getButtonSize(), parameters.getButtonSize());
		this.add(new MenuFile(biba, gui));
		
		
		//this.add(new InstrumentsToolbar(parameters, biba));
		//this.add(new ColorsToolbar(parameters, biba));
	}
}
