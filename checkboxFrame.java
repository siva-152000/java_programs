//java program to change colors by using checkbox 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class checkboxFrame extends Frame implements ItemListener
{
 Checkbox red,green,blue,yellow,white;
CheckboxGroup cbg;
public checkboxFrame()
{
  addWindowListener(new MyWindowAdapter());
 cbg=new CheckboxGroup();
 red=new Checkbox("Red",cbg,false);
 green=new Checkbox("Green",cbg,false);
 blue=new Checkbox("Blue",cbg,false);
 yellow=new Checkbox("Yellow",cbg,false);
 white=new Checkbox("White",cbg,true);
 red.addItemListener(this);
green.addItemListener(this);
blue.addItemListener(this);
yellow.addItemListener(this);
white.addItemListener(this);
add(red);
add(green);
add(blue);
add(yellow);
add(white);
}
public void paint(Graphics g)
{
String sel=cbg.getSelectedCheckbox().getLabel();
switch(sel)
{
case"Red":
                  setBackground(Color.red);
                  break;
case"Green":
                  setBackground(Color.green);
                  break;
case"Blue":
                  setBackground(Color.blue);
                  break;
case"Yellow":
                  setBackground(Color.yellow);
                  break;
case"White":
                  setBackground(Color.white);
                  break;
default:
                  setBackground(Color.cyan);
                  break;
}
}
public static void main(String args[])
{
checkboxFrame ob=new checkboxFrame();
ob.setSize(new Dimension(300,200));
ob.setTitle("An AWT-Based Application-checkboxes in frame");
ob.setLayout(new FlowLayout());
ob.setVisible(true);
}
public void itemStateChanged(ItemEvent ie)
{
  repaint();
}
}
class MyWindowAdapter extends WindowAdapter
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
}