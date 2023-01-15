class A
{
	void fn1()
	{
	}
}

abstract class B
{
	abstract void fn2();
}

class C extends A
{
	B getB()
	{
		return new B()
		{
			public void fn2()
			{
			}
		};
	}
}

class Test
{
	static void method1(A a)
	{
		a.fn1();
	}
	static void method2(B b)
	{
		b.fn2();
	}
	public static void main(String[] args)
	{
		C c=new C();
		method1(c);
		method2(c.getB());
	}
}