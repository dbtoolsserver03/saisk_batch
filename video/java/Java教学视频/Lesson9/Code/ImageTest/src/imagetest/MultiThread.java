package imagetest;

import java.applet.Applet;
import java.awt.HeadlessException;
import java.awt.*;
public class MultiThread extends Applet implements Runnable
{
  private Image[] imgs;
  private int totalImages=10;
  private int currentImage;
  private int i=0;
  private Image imgBuf;
  private Graphics gBuf;
  private MediaTracker mt;
  private boolean bStop=false;
  public void init()
  {
    mt=new MediaTracker(this);
    imgBuf=createImage(600,400);
    gBuf=imgBuf.getGraphics();
    gBuf.setColor(Color.white);
    gBuf.fillRect(0,0,600,400);
    imgs=new Image[totalImages];
    for(int i=0;i<totalImages;i++)
    {
      imgs[i]=getImage(getDocumentBase(),"T"+(i+1)+".gif");
      mt.addImage(imgs[i],i);
    }
    try {
      mt.waitForID(0);
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  public void start()
  {
    currentImage=0;
    gBuf.drawImage(imgs[currentImage],0,0,this);
    currentImage=1;
    new Thread(this).start();
  }
  public void stop()
  {
    bStop=true;
  }
  public void paint(Graphics g)
  {
    g.drawImage(imgBuf,0,0,this);
  }
  public void update(Graphics g)
  {
    paint(g);
  }
  public void run()
  {
    while(!bStop)
    {
      if(mt.checkID(currentImage,true))
      {
        gBuf.fillRect(0, 0, 600, 400);
        gBuf.drawImage(imgs[currentImage], 0, 0, this);
        currentImage = ++currentImage % 10;
      }
      try
      {
        Thread.sleep(500);
      }
      catch (Exception ex)
      {
        //ex.printStackTrace();
      }
      repaint();
    }
  }
}














