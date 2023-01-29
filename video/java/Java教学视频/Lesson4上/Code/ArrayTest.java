import java.util.Arrays;
class ArrayTest
{
	public static void main(String[] args)
	{
		/*int[] num1=new int[]{1,2,3};
		int[] num2=new int[10];
		System.arraycopy(num1,1,num2,8,2);
		for(int i=0;i<num2.length;i++)
		{
			System.out.println(num2[i]);
		}*/
		/*Point[] pts1=new Point[]{new Point(1,1),new Point(2,2),new Point(3,3)};
		Point[] pts2=new Point[3];
		System.arraycopy(pts1,0,pts2,0,pts1.length);
		for(int i=0;i<pts2.length;i++)
		{
			System.out.println("x="+pts2[i].x+","+"y="+pts2[i].y);
		}
		pts2[1].x=5;
		pts2[1].y=5;
		System.out.println("x="+pts1[1].x+","+"y="+pts1[1].y);*/
		/*int[] num=new int[]{3,1,2};
		Arrays.sort(num);
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		int index=Arrays.binarySearch(num,3);
		System.out.println("index="+index);
		System.out.println("element="+num[index]);*/
		Student[] ss=new Student[]{new Student(1,"zhangsan"),
					   new Student(2,"lisi"),
					   new Student(3,"wangwu"),
					   new Student(3,"mybole")};
		Arrays.sort(ss);
		for(int i=0;i<ss.length;i++)
		{
			System.out.println(ss[i]);
		}
		int index=Arrays.binarySearch(ss,new Student(2,"lisi"));
		System.out.println("index="+index);
		System.out.println(ss[index]);
	}
}
class Student implements Comparable
{
	int num;
	String name;
	Student(int num,String name)
	{
		this.num=num;
		this.name=name;
	}
	public String toString()
	{
		return "number="+num+","+"name="+name;
	}
	public int compareTo(Object o)
	{
		Student s=(Student)o;
		//return num>s.num ? 1 : (num==s.num ? 0 : -1);
		int result=num>s.num ? 1 : (num==s.num ? 0 : -1);
		if(0==result)
		{
			result=name.compareTo(s.name);
		}
		return result;
	}
}
class Point
{
	int x,y;
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}