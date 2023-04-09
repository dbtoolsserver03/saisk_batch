package imagetest;

import java.applet.Applet;
import java.awt.HeadlessException;
import java.awt.*;
public class ShowImage extends Applet
{
  private Image[] imgs;
  private int totalImages=10;
  private int currentImage;
  private int i=0;
  public void init()
  {
    imgs=new Image[totalImages];
    for(int i=0;i<totalImages;i++)
    {
      imgs[i]=getImage(getDocumentBase(),"T"+(i+1)+".gif");
    }
    //img=getImage(getDocumentBase(),"T1.gif");
  }
  public void start()
  {
    currentImage=0;
  }
  public void paint(Graphics g)
  {
    //g.drawImage(img,0,0,this);
    System.out.println("draw:"+i++);
    g.drawImage(imgs[currentImage],0,0,this);
    currentImage=++currentImage%10;
    try {
      Thread.sleep(500);
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
    repaint();
  }
  public void update(Graphics g)
  {
    paint(g);
  }
}

















