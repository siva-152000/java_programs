//Applet program to see the behaviour of mouse events
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
/*
<applet code="mouseevents.class" width="300" height="300">
</applet>
*/

public class mouseevents extends Applet implements MouseListener,MouseMotionListener
{
String msg="";
int x=0,y=0;

public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}

public void mouseClicked(MouseEvent me)
{
x=10;
y=20;
msg="mouse clicked";
repaint();
}


public void mouseEntered(MouseEvent me)
{
x=10;
y=20;
msg="mouse entered";
repaint();
}

public void mouseExited(MouseEvent me)
{
x=10;
y=20;
msg="mouse exited";
repaint();
}

public void mousePressed(MouseEvent me)
{
x=me.getX();
y=me.getY();
msg="down";
repaint();
}
		
public void mouseReleased(MouseEvent me)
{
x=me.getX();
y=me.getY();
msg="up";
repaint();
}

public void mouseDragged(MouseEvent me)
{
x=me.getX();
y=me.getY();
msg="*";
showStatus("dragging mouse at"+x+","+y);
repaint();
}

public void mouseMoved(MouseEvent me)
{
showStatus("moving mouse at"+me.getX()+","+me.getY());
}

public void paint(Graphics g)
{
g.drawString(msg,x,y);
setBackground(Color.cyan);
}
}
