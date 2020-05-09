import java.util.*;  
import java.applet.*;  
import java.awt.*; 
public class clock extends Applet implements Runnable  
{  
    Label l;
    Thread thr = null;  
    String st = "";  
    public void init()  
    {  
        
        Font f=new Font("Timesnewroman",Font.BOLD,34);
    	setFont(f);
    	 l=new Label("");
    	add(l);
    }  
    public void start()  
    {  
        thr = new Thread(this);  
        thr.start();  
    }  
    public void run() 
    {  
        try  
        {  
            while (true)  
            {  
            	Calendar c=Calendar.getInstance();
        		int h=c.get(Calendar.HOUR);
        		int m=c.get(Calendar.MINUTE);
        		int s=c.get(Calendar.SECOND);
        		st=h+":"+m+":"+s;
        		repaint();
                 
            }  
        } catch (Exception excp) {}  
    }  
    public void paint(Graphics grp)  
    {  
    	l.setText(st);  
    }  
}  
/*
<Applet code="clock.class" width="600" height= "500">
</applet>
*/
