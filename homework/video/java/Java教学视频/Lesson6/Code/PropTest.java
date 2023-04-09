import java.util.*;
import java.io.*;
class PropTest
{
	public static void main(String[] args)
	{
		/*Properties pps=System.getProperties();
		pps.list(System.out);*/
		Properties pps=new Properties();
		try
		{
			pps.load(new FileInputStream("winsun.ini"));
			Enumeration enum=pps.propertyNames();
			while(enum.hasMoreElements())
			{
				String strKey=(String)enum.nextElement();
				String strValue=pps.getProperty(strKey);
				
				System.out.println(strKey+"="+strValue);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}