import java.awt.*;
import java.awt.event.*;


public class ButtonPanel extends Frame 
{


/*****************
 * Konstruktor   *
 *****************/
	public ButtonPanel()
	{
		setTitle("Panel mit Buttons");
		setSize(300,200);
		addPanel();
		
		addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
			
		}
		});
	}

/******************************
 * Panel + Buttons hinzufügen *
 ******************************/
	
	
private void addPanel() 
{
	// TODO Auto-generated method stub
	Panel panel = new Panel();
	add(panel);
	
	setLayout(new FlowLayout());
	
	add(new Button("Button 11"));
	add(new Button("Button 12"));
	add(new Button("Button 13"));
	add(new Button("Button 14"));
	
}

/**************
 * Startpunkt *
 **************/

public static void main(String[] args)
{
	Frame rahmen = new ButtonPanel();
	rahmen.show();
		
}

}







