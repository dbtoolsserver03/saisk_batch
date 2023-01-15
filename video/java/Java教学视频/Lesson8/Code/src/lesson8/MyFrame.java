package lesson8;

import java.awt.*;
import java.awt.event.*;
public class MyFrame
{
  public static void main(String[] args)
  {
    Frame f=new Frame("mybole");
    f.setSize(600,400);
    f.setLocation(100,100);
    f.setBackground(Color.blue);
    //f.setLayout(new BorderLayout(10,10));
    //f.setLayout(new FlowLayout(FlowLayout.LEFT));
    f.setLayout(new GridLayout(3,2,10,10));
    Button btn1=new Button("winsun");
    Button btn2=new Button("weixin");
    Button btn3=new Button("West");
    Button btn4=new Button("East");
    Button btn5=new Button("Center");
    f.add(btn1,"North");
    f.add(btn2,"South");
    f.add(btn3,"West");
    f.add(btn4,"East");
    f.add(btn5,"Center");
    //f.addWindowListener(new MyWindowListener());
    //f.addWindowListener(new YourWindowListener());
    //f.addWindowListener(new HisWindowListener());
    /*f.addWindowListener(new WindowAdapter()
                        {
                          public void windowClosing(WindowEvent e)
                          {
                            System.exit(0);
                          }
                        });*/

    f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          System.exit(0);
        }
      });
    f.show();
  }
}

class MyWindowListener implements WindowListener
{
  public void windowOpened(WindowEvent e)
  {

  }
  public void windowClosing(WindowEvent e)
  {
    System.exit(0);
  }
  public void windowClosed(WindowEvent e)
  {
  }
  public void windowIconified(WindowEvent e)
  {

  }
  public void windowDeiconified(WindowEvent e)
  {

  }
  public void windowActivated(WindowEvent e)
  {

  }
  public void windowDeactivated(WindowEvent e)
  {

  }
}
class YourWindowListener implements WindowListener
{
  public void windowOpened(WindowEvent e)
  {

  }
  public void windowClosing(WindowEvent e)
  {
    System.exit(0);
  }
  public void windowClosed(WindowEvent e)
  {

  }
  public void windowIconified(WindowEvent e)
  {

  }
  public void windowDeiconified(WindowEvent e)
  {

  }
  public void windowActivated(WindowEvent e)
  {

  }
  public void windowDeactivated(WindowEvent e)
  {

  }

}

class HisWindowListener extends WindowAdapter
{
  public void windowClosing(WindowEvent e)
  {
    System.exit(0);
  }
}

















