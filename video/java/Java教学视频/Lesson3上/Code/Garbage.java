class Garbage
{
	int index;
	static int count;
	Garbage()
	{
		count++;
		System.out.println("object "+count+" construct");
		setID(count);
	}
	
	void setID(int id)
	{
		index=id;
	}
	
	protected void finalize()
	{
		System.out.println("object "+index+" is reclaimed");
	}
	
	public static void main(String[] args)
	{
		new Garbage();
		new Garbage();
		new Garbage();
		new Garbage();
		System.gc();
	}
}