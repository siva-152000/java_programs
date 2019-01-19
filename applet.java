//applet program to accept and display only integers
import  java.awt.*;
import  java.awt.event.*;
import  java.applet.*;
/*
<applet code="applet" width=380 height=150>
</applet>
*/
public class applet extends Applet implements ActionListener,KeyListener 
{
	TextField name;
	Label namep;
	int MAX_LEN = 10;
	public void init() 
	{
		namep = new Label("Enter the number: ", Label.RIGHT);
		name = new TextField(12);
		add(namep);
		add(name);
		// register to receive action events
		name.addActionListener(this);
		name.addKeyListener(this);
		
	}
// User pressed Enter.
public void actionPerformed(ActionEvent ae) 
	{
		repaint();
	}
	public void keyPressed(KeyEvent EVT) 
	{
	String value = name.getText();
                int l = value.length()+1;
		showStatus("len ="+l);
		if(l<=MAX_LEN)
		{
	if (EVT.getKeyChar() >= '0' && EVT.getKeyChar() <= '9') 
			{
		name.setEditable(true);
	}
else 
			{
		name.setEditable(false);
		showStatus("Enter only numeric digits(0-9)");     
			}
		}
		else
		{
			//name.setEditable(false);
		showStatus("length cannot exceed 10....");
			name.setText(name.getText().substring(0,MAX_LEN ));
		}		
       }
	public void keyReleased(KeyEvent EVT) 
	{}
	public void keyTyped(KeyEvent EVT) 
	{}
	public void paint(Graphics g) 
	{
		g.drawString("Number is: " + name.getText(), 6, 60);
		showStatus(" ");
	}
}
