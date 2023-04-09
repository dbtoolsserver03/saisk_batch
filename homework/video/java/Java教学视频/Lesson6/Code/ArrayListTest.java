import java.util.*;
class ArrayListTest
{
	public static void printElements(Collection c)
	{
		Iterator it=c.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args)
	{
		//ArrayList al=new ArrayList();
		/*al.add("winsun");
		al.add("weixin");
		al.add("mybole");*/
		/*al.add(new Point(3,3));
		al.add(new Point(2,2));
		al.add(new Point(4,4));*/
		
		/*for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}*/
		/*System.out.println(al);
		Object[] objs=al.toArray();
		for(int i=0;i<objs.length;i++)
		{
			System.out.println(objs[i]);
		}
		List l=Arrays.asList(objs);
		System.out.println(l);
		printElements(al);*/
		//l.add("zhangsan");
		//Iterator it=al.iterator();
		/*Iterator it=l.iterator();
		it.next();
		it.remove();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		Student s1=new Student(2,"zhangsan");
		Student s2=new Student(1,"lisi");
		Student s3=new Student(3,"wangwu");
		Student s4=new Student(2,"mybole");
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al,Collections.reverseOrder());//new Student.StudentComparator());
		printElements(al);
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
	public String toString()
	{
		return "x="+x+","+"y="+y;
	}
}

class Student implements Comparable
{
	int num;
	String name;
	static class StudentComparator implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			int result=s1.num > s2.num ? 1 : (s1.num==s2.num ? 0 : -1);
			if(result==0)
			{
				result=s1.name.compareTo(s2.name);
			}
			return result;
		}
	}
	Student(int num,String name)
	{
		this.num=num;
		this.name=name;
	}
	
	public int compareTo(Object o)
	{
		Student s=(Student)o;
		return num > s.num ? 1 : (num==s.num ? 0 : -1);
	}
	public String toString()
	{
		return num+":"+name;
	}
}
