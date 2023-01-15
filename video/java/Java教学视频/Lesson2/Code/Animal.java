class Animal
{
	int height,weight;
	Animal(int height,int weight)
	{
//		System.out.println("animal construct");
	}
	void eat()
	{
		System.out.println("animal eat");
	}
	void sleep()
	{
		System.out.println("animal sleep");
	}
	void breathe()
	{
		System.out.println("animal breathe");
	}
}

class Fish extends Animal
{
	int height;
	Fish()
	{
		super(30,40);
		//Animal(30,40);
//		System.out.println("fish construct");
	}
	/*void breathe()
	{
//		super.breathe();
//		super.height=40;
		System.out.println("fish bubble");
	}*/
}

class Integration
{
	static void fn(Animal an)
	{
		an.breathe();
	}
	public static void main(String[] args)
	{
		//Animal an=new Animal();
		/*Fish fh=new Fish();
		Animal an;
		an=fh;
		Integration.fn(an);*/
		//an.breathe();
//		fh.height=30;
//		fh.breathe();
		Animal an=new Animal(30,40);
		Fish fh=new Fish();
		an=fh;
		/*if(an instanceof Animal)
		{
			System.out.println("an is animal's instance");
		}
		if(fh instanceof Fish)
		{
			System.out.println("fh is fish's instance");
		}*/
		if(an instanceof Fish)
		{
			System.out.println("an is fish's instance");
		}
		else
		{
			System.out.println("an isn't fish's instance");
		}
		if(fh instanceof Animal)
		{
			System.out.println("fh is animal's instance");
		}
		else
		{
			System.out.println("fh isn't animal's instance");
		}
	}
}