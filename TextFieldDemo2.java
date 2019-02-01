//Applet program to accept only integers in text field
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="TextFieldDemo2" width="380" height="150">
 </applet>*/
public class TextFieldDemo2 extends Applet implements ActionListener,KeyListener
{
	TextField name;
	Label namep;
	int max_len=10;
	public void init()
	{
		namep = new Label("enter the number",Label.RIGHT);
		name = new TextField(12);
		add(namep);
		add(name);
		name.addActionListener(this);
		name.addKeyListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void keyPressed(KeyEvent EVT)
	{
		String value = name.getText();
		int I = value.length()+1;
		showStatus("len="+I);
		if(I<=max_len)
		{
			if(EVT.getKeyChar()>='0'&&EVT.getKeyChar()<='9')
                                                                        {
				name.setEditable(true);
}
			else

			{
				name.setEditable(false);
				showStatus("enter only numeric digits between 0-9");
				
			}
		}
		else
		{
			//name.setEditable(false);
			showStatus("length can't exceeded 10...");
			name.setText(name.getText().substring(0,max_len));
			
			
		}
	}
	public void keyReleased(KeyEvent EVT)
	{}
                   public void keyTyped(KeyEvent EVT)
                   {}
	public void paint(Graphics g)
	{
		g.drawString("numberis:"+name.getText(),6,60);
		showStatus("");
	}
	}