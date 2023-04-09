import java.util.*;
import java.nio.charset.*;
class CharsetTest
{
	public static void main(String[] args) throws Exception
	{
		/*Map m=Charset.availableCharsets();
		Set names=m.keySet();
		Iterator it=names.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		Properties pps=System.getProperties();
		//pps.list(System.out);
		pps.put("file.encoding","ISO-8859-1");
		int data;
		byte[] buf=new byte[100];
		int i=0;
		while((data=System.in.read())!='q')
		{
			buf[i]=(byte)data;
			i++;
		}
		String str=new String(buf,0,i);
		//System.out.println(str);
		String strGBK=new String(str.getBytes("ISO-8859-1"),"GBK");
		System.out.println(strGBK);
	}
}