import java.awt.Dimension;

public class Parameters
{
	private Dimension screenSize;
	private int buttonSize;
	private int oknoWidth;
	private int oknoHeight;
	private int colColors;
	
	public Parameters(Dimension screenSize, int buttonSize, int oknoWidth, int oknoHeight)
	{
		this.screenSize = screenSize;
		this.buttonSize = buttonSize;
		this.oknoWidth = oknoWidth;
		this.oknoHeight = oknoHeight;
		this.colColors = colColors;
	}
	//������� ������ ��� ������� ������
	public Dimension getScreenSize()
	{
		return this.screenSize;
	}
	//������� ������ ��� ������� ������
	public int getButtonSize()
	{
		return this.buttonSize;
	}
	//������� ������ ��� ������� ������
	public int getOknoWidth()
	{
		return this.oknoWidth;
	}
	//������� ������ ��� ������� ������
	public int getOknoHeight()
	{
		return this.oknoHeight;
	}
	public int getColColors()
	{
		return this.colColors;
	}
}
