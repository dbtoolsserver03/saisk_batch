class Outer
{
	private static int index=100;
	void fn(final int a)
	{
		/*final int b=0;
		if(true)
		{
			class Middle
			{
				private int index=60;
				class Inner
				{
					private int index=50;
					void print()
					{
						int index=30;
						System.out.println(index);
						System.out.println(this.index);
						System.out.println(Middle.this.index);
						System.out.println(Outer.this.index);
						//a=5;
						//b=6;
						System.out.println(a);
						System.out.println(b);
					}
				}
			}
		}*/
	}
	class Inner
	{
		private int index=50;
		static void print()
		{
			int index=30;
			System.out.println(index);
			//System.out.println(this.index);
			//System.out.println(Outer.index);
			
		}
	}
	void print()
	{
	/*	Inner inner=new Inner();
		inner.print();*/
	}
	/*Inner getInner()
	{
		return new Inner();
	}*/
	/*public static void main(String[] args)
	{
		Outer outer=new Outer();
		//outer.print();
		Inner inner=new Inner();//outer.getInner();
		inner.print();
	}*/
}

class Test
{
	public static void main(String[] args)
	{
		Outer outer=new Outer();
		//outer.print();
		//Outer.Inner inner=outer.getInner();
		/*Outer.Inner inner=outer.getInner();
		inner.print();*/
		//Outer.Inner inner=outer.new Inner();
	}
}