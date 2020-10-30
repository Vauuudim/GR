import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class GraphicEditor
{
	public static void main(String[] args)
	{
		int buttonSize = 50;
		int oknoWidth = 1280;
		int oknoHeight = 720;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		//������� ������ ������ � ������ ������ � ����� Parameters
		Parameters parameters = new Parameters(screenSize, buttonSize, oknoWidth, oknoHeight);
		
		//��������� �������� ���� � ������� �������
		EventQueue.invokeLater(() ->
		{
			Bibigalo biba = new Bibigalo(parameters);
			GUI okno = new GUI(parameters, biba);
			okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		});
		
		
		
		//GUI okno = new GUI();
		
	}
}
