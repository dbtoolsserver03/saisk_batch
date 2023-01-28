class Test
{
	public static void main(String[] args)
	{
		int i=0xffffffff;
		//int c=i<<2;
		//int c=i>>2;
		int c=i>>>2;
		System.out.println(i);
		System.out.println(Integer.toHexString(c));
		
	}
}