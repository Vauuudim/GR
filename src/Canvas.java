import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Canvas extends JPanel
{
	private Bibigalo biba;
	private Canvas eto;
	
	public Canvas(Parameters parameters, Bibigalo biba, GUI gui)
	{
		this.biba = biba;
		eto = this;
		//this.setBounds(0, parameters.getButtonSize(), parameters.getOknoWidth(), parameters.getOknoHeight());
		this.setBounds(parameters.getButtonSize(), parameters.getButtonSize(), parameters.getScreenSize().width, parameters.getScreenSize().height);
		
		this.addMouseListener(new MouseListener()
		{
            @Override
            public void mouseClicked(MouseEvent event)
            {
            	
            }

            @Override
            public void mouseEntered(MouseEvent event)
            {
            	
            }

            @Override
            public void mouseExited(MouseEvent event)
            {
            	
            }

            @Override
            public void mousePressed(MouseEvent event)
            {
                if(biba.getLast() != null)
                {
                	biba.addCoordN(event.getPoint());
                    biba.addCoordD(event.getPoint());
                   // repaint();
                    gui.repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent event)
            {
                if(biba.getLast() != null)
                {
                	biba.addCoordO(event.getPoint());
                	//repaint();
                	gui.repaint();
                }
            }
    });
		
    this.addMouseMotionListener(new MouseMotionListener()
    {
        @Override
        public void mouseDragged(MouseEvent event)
        {
            if(biba.getLast() != null)
            {
            	biba.addCoordD(event.getPoint());
            	//repaint();
            	gui.repaint();
            }
        }

        @Override
        public void mouseMoved(MouseEvent event)
        {
        	
        }
    });
		
	}
	public void paint(Graphics g)
	{
		g.drawImage(biba.getBuferImage(), 0, 0, eto);
	}
}
