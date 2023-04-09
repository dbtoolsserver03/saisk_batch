class StringTest
{
	public static void change(int x,int y)
	{
		x=x+y;
		y=x-y;
		x=x-y;
	}
	public static void change(int[] num)
	{
		num[0]=num[0]+num[1];
		num[1]=num[0]-num[1];
		num[0]=num[0]-num[1];
	}
	public static void change(Point pt)
	{
		pt.x=pt.x+pt.y;
		pt.y=pt.x-pt.y;
		pt.x=pt.x-pt.y;
	}
	
	public static void main(String[] args)
	{
		/*int x=3;
		int y=4;
		change(x,y);
		System.out.println("x="+x+","+"y="+y);*/
		/*int[] num=new int[]{3,4};
		change(num);
		System.out.println("x="+num[0]+","+"y="+num[1]);*/
		/*Point pt=new Point();
		pt.x=3;
		pt.y=4;
		change(pt);
		//System.out.println("x="+pt.x+","+"y="+pt.y);
		System.out.println(pt);*/
		//System.out.println(args[0]);
		/*if(args.length>0)
		{
			for(int i=0;i<args.length;i++)
			{
				System.out.println(args[i]);
			}
		}*/
		/*String str1=new String("abc");
		String str2=new String("abc");
		String str3=str1;*/
		/*if(str1==str2)
		{
			System.out.println("str1==str2");
		}
		else
		{
			System.out.println("str1!=str2");
		}*/
		/*if(str1==str3)
		{
			System.out.println("str1==str3");
		}
		else
		{
			System.out.println("str1!=str3");
		}*/
		/*if(str1.equals(str2))
		{
			System.out.println("str1 equals str2");
		}
		else
		{
			System.out.println("str1 not equals str2");
		}*/
		/*int i=3;
		float f=1.5f;
		char ch='f';
		boolean b=false;
		//System.out.println(str1+i+f+ch+b);
		StringBuffer sb=new StringBuffer();
		sb.append(str1).append(i).append(f).append(ch).append(b);
		//System.out.println(sb.toString());
		sb.delete(4,8);
		sb.insert(4,"mybole");
		System.out.println(sb);*/
		/*int[] num=new int[3];
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		num=null;*/
		/*Student[] students;
		students=new Student[3];
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i]);
		}*/
		Professor p=new Professor("wangwu",50);
		Student s1=new Student("zhangsan",18,p);
		Student s2=(Student)s1.clone();
		/*s2.name="lisi";
		s2.age=20;*/
		s2.p.name="lisi";
		s2.p.age=30;
		//System.out.println("name="+s1.name+","+"age="+s1.age);
		System.out.println("name="+s1.p.name+","+"age="+s1.p.age);
	}
}

class Professor implements Cloneable
{
	String name;
	int age;
	Professor(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public Object clone()
	{
		Object o=null;
		try
		{
			o=super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println(e.toString());
		}
		return o;
	}
}
class Student implements Cloneable
{
	String name;
	int age;
	Professor p;
	Student(String name,int age,Professor p)
	{
		this.name=name;
		this.age=age;
		this.p=p;
	}
	public Object clone()
	{
		//Object o=null;
		Student o=null;
		try
		{
			o=(Student)super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println(e.toString());
		}
		o.p=(Professor)p.clone();
		return o;
	}
}
class Point
{
	int x,y;
	public String toString()
	{
		return "x="+x+","+"y="+y;
	}
}