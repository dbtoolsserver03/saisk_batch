import java.io.*;
class RuntimeTest
{
	public static void main(String[] args)
	{
		Runtime rt=Runtime.getRuntime();
		System.out.println(rt.freeMemory());
		System.out.println(rt.totalMemory());
		try
		{
			//rt.exec("notepad");
			Process p=rt.exec("javac ArrayTest.java");
			InputStream is=p.getInputStream();
			int data;
			while((data=is.read())!=-1)
			{
				System.out.print((char)data);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}