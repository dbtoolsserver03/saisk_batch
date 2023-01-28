interface Machine
{
	void run();
}

class Person
{
	void run()
	{
		System.out.println("run");
	}
}

class Robot extends Person
{
	private class MachineHeart implements Machine
	{
		public void run()
		{
			System.out.println("heart run");
		}
	}
	Machine getMachine()
	{
		return new MachineHeart();
	}
}

class Test
{
	public static void main(String[] args)
	{
		Robot robot=new Robot();
		Machine m=robot.getMachine();
		m.run();
		robot.run();
	}
}