import java.io.*;
class Excep
{
	Excep() throws ArithmeticException
	{
	}
	public int division(int a,int b) throws ArithmeticException,DivisorIsMinusException//Exception
	{
		//try
		//{
			if(b<0)
				throw new DivisorIsMinusException("Divisor can't be minus");
			return a/b;
		/*}
		catch(ArithmeticException e)
		{
			
			e.printStackTrace();
			throw new Exception("can't divide by zero");
			//throw e;
			//return 0;
		}*/
		
	}
	public int fn1(int a,int b) throws ArithmeticException,DivisorIsMinusException//Exception
	{
		return division(a,b);
	}
}

class ChildExcep extends Excep
{
	ChildExcep() throws FileNotFoundException
	{
	}
	public int division(int a,int b) throws ArithmeticException,DivisorIsMinusException
	{
		return a/b;
	}
}
class DivisorIsMinusException extends Exception
{
	DivisorIsMinusException(String str)
	{
		super(str);
	}
}
class ExcepTest
{
	public static int method1(Excep excep)
	{
		try
		{
			return excep.division(5,0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		catch(DivisorIsMinusException ex)
		{
			System.out.println(ex.toString());
			//System.exit(-1);
			//return;
		}
		return 0;
	}
	public static void main(String[] args) //throws Exception
	{
		ChildExcep ce=new ChildExcep();
		method1(ce);
		Excep excep=new Excep();
		try
		{
			//excep.division(5,0);	
			excep.fn1(5,-1);
			System.out.println("exception");
			return;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		catch(DivisorIsMinusException ex)
		{
			System.out.println(ex.toString());
			System.exit(-1);
			//return;
		}
		catch(Exception e)
		{
			//System.out.println("can't divide by zero");
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("finish");
	}
}