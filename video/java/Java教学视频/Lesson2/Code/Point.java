class Point
{
	int x,y;
	static int z;
	static final double PI=3.1415926;
	Point(int a,int b)
	{
//		PI=3.1415926;
		x=a;
		y=b;
	}
	
	Point()
	{
//		PI=3.1415926;
		this(1,1);	
	}
	static void output()
	{
		System.out.println("output() called");
		System.out.println(z);
//		System.out.println(x);
//		System.out.println(y);
	}
	void output(int x,int y)
	{
		output();
		z=5;
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args)
	{
		Point pt1=new Point();
		Point pt2=new Point();
		
		pt1.z=5;
		pt2.z=6;
		
		System.out.println(pt1.z);
		System.out.println(pt2.z);
		//pt.output();
		//Point.output();
		//Point pt;
		//pt=new Point(3,3);
		//pt=new Point();
		//pt.output(5,5);
		//pt=new Point();
		//pt.x=10;
		//pt.y=10;
		//pt.output();
		/*Point pt2=new Point();
		//pt2.output();
		pt.x=6;
		pt2.x=7;
		System.out.println(pt.x);
		System.out.println(pt2.x);*/
		
	}
}