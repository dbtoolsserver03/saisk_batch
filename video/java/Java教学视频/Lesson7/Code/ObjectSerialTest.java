import java.io.*;

class ObjectSerialTest
{
	public static void main(String[] args) throws Exception
	{
		Employee e1=new Employee("zhangsan",25,3000.50);
		Employee e2=new Employee("lisi",24,3200.40);
		Employee e3=new Employee("wangwu",27,3800.55);
		
		FileOutputStream fos=new FileOutputStream("employee.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.writeObject(e3);
		oos.close();
		
		FileInputStream fis=new FileInputStream("employee.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e;
		for(int i=0;i<3;i++)
		{
			e=(Employee)ois.readObject();
			System.out.println(e.name+":"+e.age+":"+e.salary);
		}
		ois.close();
	}
}

class Employee implements Serializable
{
	String name;
	int age;
	double salary;
	transient Thread t=new Thread();
	public Employee(String name,int age,double salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	private void writeObject(java.io.ObjectOutputStream oos) throws IOException
	{
		oos.writeInt(age);
		oos.writeUTF(name);
		System.out.println("Write Object");
	}
	private void readObject(java.io.ObjectInputStream ois) throws IOException
	{
		age=ois.readInt();
		name=ois.readUTF();
		System.out.println("Read Object");
	}

}