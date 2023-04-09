import java.io.*;
class FileTest
{
	public static void main(String[] args) throws Exception
	{
		//File f=new File("1.txt");
		//f.createNewFile();
		//f.mkdir();
		//File f=new File("E:\\JavaLesson\\Lesson7\\1.txt");
		//f.createNewFile();
		/*File fDir=new File(File.separator);
		String strFile="JavaLesson"+File.separator+"Lesson7"+
			File.separator+"1.txt";
		File f=new File(fDir,strFile);
		f.createNewFile();
		//f.delete();
		f.deleteOnExit();
		Thread.sleep(3000);*/
		/*for(int i=0;i<5;i++)
		{
			File f=File.createTempFile("winsun",".tmp");
			f.deleteOnExit();
		}
		Thread.sleep(3000);*/
		File fDir=new File(File.separator);
		String strFile="JavaLesson"+File.separator+"Lesson6";
		File f=new File(fDir,strFile);
		String[] names=f.list(new FilenameFilter()
		{
			public boolean accept(File dir,String name)
			{
				return name.indexOf(".java")!=-1;
			}
		});
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
	}
}