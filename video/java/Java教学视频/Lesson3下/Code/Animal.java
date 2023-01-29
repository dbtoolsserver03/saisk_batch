interface Animal
{
	void eat();
	void sleep();
}

class Zoo
{
	private class Tiger implements Animal
	{
		public void eat()
		{
			System.out.println("tiger eat");
		}
		public void sleep()
		{
			System.out.println("tiger sleep");
		}
	}
	Animal getAnimal()
	{
		return new Tiger();
	}
	/*Animal getAnimal()
	{
		return new Animal()
		{
			public void eat()
			{
				System.out.println("animal eat");
			}
			public void sleep()
			{
				System.out.println("animal sleep");
			}
		};
	}*/
}

class Test
{
	public static void main(String[] args)
	{
		Zoo z=new Zoo();
		Animal an=z.getAnimal();
		an.eat();
		an.sleep();
	}
}