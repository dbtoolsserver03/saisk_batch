import java.applet.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URL;
public class TestApplet extends Applet
{
	String strFont;
	int xOrigin,yOrigin;
	public void init()
	{
		Button btn=new Button("链接");
		add(btn);
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					getAppletContext().showDocument(
						new URL("http://localhost/postinfo.html"),"_blank");
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		strFont=getParameter("font");
		addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				xOrigin=e.getX();
				yOrigin=e.getY();
			}
			public void mouseReleased(MouseEvent e)
			{
				Graphics g=getGraphics();
				g.setColor(Color.red);
				g.drawLine(xOrigin,yOrigin,e.getX(),e.getY());
			}
		});
		//System.out.println("init");
	}
	public void start()
	{
		System.out.println("start");
	}
	public void stop()
	{
		System.out.println("stop");
	}
	public void destroy()
	{
		System.out.println("destroy");
	}
	public void paint(Graphics g)
	{
		//Font f=new Font("楷体_GB2312",Font.BOLD,30);
		Font f=new Font(strFont,Font.BOLD,30);
		g.setFont(f);
		g.setColor(Color.blue);
		g.drawString("维新科学技术培训中心",0,30);
	}
}

//<applet code="TestApplet.class" width=600 height=400>
//</applet>