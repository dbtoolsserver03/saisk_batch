interface Math
{
	double PI=3.1415926;	
}

class Arithmetic implements Math
{
	double roundArea(double radius)
	{
		return PI*radius*radius;		
	}
}

class Student
{
	public static void main(String[] args)
	{
		Arithmetic a=new Arithmetic();
		System.out.println(a.roundArea(3));
		System.out.println(Math.PI);
		System.out.println(Arithmetic.PI);
		System.out.println(a.PI);
	}
}