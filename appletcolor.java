//Applet pogram to change colors randomly every 2seconds
import java.awt.*;
import java.applet.*;
import java.util.Random;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/*<applet code=appletcolor height=600 width=600>
   </applet>
*/
public class appletcolor extends Applet implements Runnable
{
Color c;
DateFormat df;
Date dateobj;
Random rand;
int max=255;
int min=0;
public void init()
{
repaint();
Thread th = new Thread(this);
df = new SimpleDateFormat("HH:mm:ss");
rand=new Random();
th.start();
}
public void run()
{
try
{
while(true)
{
float r=rand.nextFloat();
float g=rand.nextFloat();
float b=rand.nextFloat();
c=new Color(r,g,b);
repaint();
Thread.sleep(2000);
}
}
catch(Exception ex)
{
ex.printStackTrace();
}
}
public void paint(Graphics g)
{
repaint();
}
public void update(Graphics g)
{
dateobj=new Date();
g.drawString("current time is"+df.format(dateobj),20,20);
setBackground(c);
}
}



