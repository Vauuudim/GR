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
	//Функция геттер для размера экрана
	public Dimension getScreenSize()
	{
		return this.screenSize;
	}
	//Функция геттер для размера кнопок
	public int getButtonSize()
	{
		return this.buttonSize;
	}
	//Функция геттер для размера кнопок
	public int getOknoWidth()
	{
		return this.oknoWidth;
	}
	//Функция геттер для размера кнопок
	public int getOknoHeight()
	{
		return this.oknoHeight;
	}
	public int getColColors()
	{
		return this.colColors;
	}
}
