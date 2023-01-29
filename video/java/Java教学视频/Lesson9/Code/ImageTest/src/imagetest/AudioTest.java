package imagetest;

import java.applet.*;
import java.awt.HeadlessException;

public class AudioTest extends Applet
{
  private AudioClip ac;
  public void init()
  {
    ac=getAudioClip(getDocumentBase(),"1.au");
  }
  public void start()
  {
//    play(getDocumentBase(),"1.au");
    ac.loop();
  }
  public void stop()
  {
    ac.stop();
  }
}