interface Sport
{
	void run();
	void jump();
}

class Athlete implements Sport
{
	public void run()
	{
		System.out.println("¶ÌÅÜ");
	}
	public void jump()
	{
		System.out.println("Èı¼¶Ìø");
	}
	public static void main(String[] args)
	{
		Athlete zhangsan=new Athlete();
		zhangsan.run();
		zhangsan.jump();
	}
}