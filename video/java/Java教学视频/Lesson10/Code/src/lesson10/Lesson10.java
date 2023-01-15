package lesson10;

import java.net.*;
import java.io.*;
public class Lesson10 extends Thread
{
  public static void main(String[] args)
  {
    if(args.length>0)
      recv();
    else
      send();
  }
  public static void recv()
  {
    try {
      DatagramSocket ds=new DatagramSocket(6000);
      byte[] buf=new byte[100];
      DatagramPacket dp=new DatagramPacket(buf,100);
      ds.receive(dp);
      System.out.println(new String(buf,0,dp.getLength()));
      String str="Welcome you!";
      DatagramPacket dpSend=new DatagramPacket(str.getBytes(),str.length(),
                                           dp.getAddress(),dp.getPort());
      ds.send(dpSend);
      ds.close();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  public static void send()
  {
    try {
      DatagramSocket ds=new DatagramSocket();
      String str="Hello,this is zhangsan";
      DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),
                                           InetAddress.getByName("localhost"),
                                           6000);
      ds.send(dp);
      byte[] buf=new byte[100];
      DatagramPacket dpRecv=new DatagramPacket(buf,100);
      ds.receive(dpRecv);
      System.out.println(new String(buf,0,dpRecv.getLength()));
      ds.close();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  /*private Socket s;
  public Lesson10(Socket s)
  {
    this.s=s;
  }
  public void run()
  {
    try {
      OutputStream os=s.getOutputStream();
      BufferedOutputStream bos=new BufferedOutputStream(os);
      InputStream is=s.getInputStream();
//      os.write("Hello,welcome you!".getBytes());
      bos.write("Hello,welcome you!".getBytes());
      //bos.flush();
      byte[] buf=new byte[100];
      int len=is.read(buf);
      System.out.println(new String(buf,0,len));
      //os.close();
      bos.close();
      is.close();
      s.close();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  public static void main(String[] args)
  {
    if(args.length>0)
      server();
    else
      client();
  }
  public static void server()
  {
    try {
      ServerSocket ss=new ServerSocket(6000);
      while(true)
      {
        Socket s = ss.accept();
        new Lesson10(s).start();
      }
      //ss.close();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  public static void client()
  {
    try {
      Socket s=new Socket(InetAddress.getByName(null),6000);
      OutputStream os=s.getOutputStream();
      InputStream is=s.getInputStream();
      byte[] buf=new byte[100];
      int len=is.read(buf);
      System.out.println(new String(buf,0,len));
      os.write("Hello,this is wangwu".getBytes());
      os.close();;
      is.close();
      s.close();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }

  }*/
}
















