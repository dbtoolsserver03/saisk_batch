class Rectangle
{
	int l,w;
	int perimeter()
	{
		return 2*(l+w);
	}
	int area()
	{
		return l*w;
	}
	public static void main(String[] args)
	{
		Rectangle rect1=new Rectangle();
		Rectangle rect2=new Rectangle();
		
		rect1.l=10;
		rect1.w=5;
		System.out.println("perimeter of rect1 = "+rect1.perimeter());
		System.out.println("area of rect1 = "+rect1.area());
		
		rect2.l=6;
		rect2.w=4;
		System.out.println("perimeter of rect2 = "+rect2.perimeter());
		System.out.println("area of rect2 = "+rect2.area());
		
	}
}