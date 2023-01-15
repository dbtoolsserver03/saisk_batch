import java.io.*;

class RandomFileTest
{
	public static void main(String[] args) throws Exception
	{
		Student s1=new Student(1,"zhangsan",98.5);
		Student s2=new Student(2,"lisi",96.5);
		Student s3=new Student(3,"wangwu",78.5);
		RandomAccessFile raf=new RandomAccessFile("student.txt","rw");
		s1.writeStudent(raf);
		s2.writeStudent(raf);
		s3.writeStudent(raf);
		
		Student s=new Student();
		raf.seek(0);
		for(long i=0;i<raf.length();i=raf.getFilePointer())
		{
			s.readStudent(raf);
			System.out.println(s.num+":"+s.name+":"+s.score);
		}
		raf.close();
	}
}

class Student
{
	int num;
	String name;
	double score;
	public Student()
	{
	}
	public Student(int num,String name,double score)
	{
		this.num=num;
		this.name=name;
		this.score=score;
	}
	public void writeStudent(RandomAccessFile raf) throws IOException
	{
		raf.writeInt(num);
		raf.writeUTF(name);
		raf.writeDouble(score);
	}
	public void readStudent(RandomAccessFile raf) throws IOException
	{
		num=raf.readInt();
		name=raf.readUTF();
		score=raf.readDouble();
	}
}