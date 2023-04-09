class Test
{
	public static void main(String[] args)
	{
		int i=3;
		Integer in=new Integer(i);
		int j=in.intValue();
		System.out.println("j="+j);
		String str=in.toString();
		System.out.println("str="+str);
		
		String str2="134";
		System.out.println(Integer.valueOf(str2));
	}
}