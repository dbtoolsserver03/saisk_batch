package cn.mybole;

//import java.io.File;
//import java.io.*; 
//import com.winsunlight.Test2;
public abstract class Test// extends com.winsunlight.Test2
{
	public final void pubMethod()
	{
		System.out.println("pubMethod");
	}
	
	protected abstract void proMethod();
	/*{
		System.out.println("proMethod");
	}*/
	
	void defMethod()
	{
		System.out.println("defMethod");
	}
	
	private void priMethod()
	{
		System.out.println("priMethod");
	}
	public static void main(String[] args)
	{
		/*Test t=new Test();
		java.io.File f;
		System.out.println("test!");*/
		//com.winsunlight.Test2 t2=new com.winsunlight.Test2();
		
		/*Test t=new Test();
		t.pubMethod();
		t.proMethod();
		t.defMethod();
		t.priMethod();*/
	}
}