import java.applet.Applet;
import java.awt.*;
import java.util.*;
/*<applet code="Clock" width="300" height="200"></applet>*/
public class Clock extends Applet implements Runnable
{
Thread t1,t;
public void start()
{
t=new Thread(this);
t.start();
}
public void run()
{
t1=Thread.currentThread();
while(t1==t)
{
repaint();
try
{
t1.sleep(1000);
}
catch(InterruptedException e)
{}
}
}
public void paint(Graphics g) {
Calendar cal=new GregorianCalendar();
String hour=String.valueOf(cal.get(Calendar.HOUR));
String minute=String.valueOf(cal.get(Calendar.MINUTE));
String second=String.valueOf(cal.get(Calendar.SECOND));
g.drawString(hour + ":" + minute + ":" +second,50,30);
}
}