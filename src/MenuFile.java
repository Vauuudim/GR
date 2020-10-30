import javax.swing.JMenu;

public class MenuFile extends JMenu
{
	public MenuFile(Bibigalo biba, GUI gui)
	{
		super("‘¿…À");
		this.add(new SaveButton(biba));
		this.add(new SaveSerializableButton(biba));
		this.add(new LoadSerializableButton(biba, gui));
	}
}

