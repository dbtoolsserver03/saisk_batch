package jp.co.yahoo.hw.ym20230205.saisk.test.exe;

public class TestA04 {

	
	public static void main(String[] args) {
		
		TypeA obj1 = new TypeA("obj1");
		
		TypeA obj2 = new TypeA("obj2");
		
		String str = "abc";
		
		fun(obj1,obj2,str);
		
		System.out.println(obj1.getName());
		System.out.println(obj2.getName());
		System.out.println(str);
		
	}

	// 类通过方法改变类里面值的时候，不可以在里面去NEW对象来改值
	private static void fun(TypeA obj1, TypeA obj2, String str) {
		obj1.setName("li4");
		obj2 = new TypeA("wang5");
		str = "123";
	}
}

class TypeA {
	
	public TypeA(String name) {
		this.name = name;
		
	}
	// 如果类里面提供了带有参数的构造方法，
	// 就不会提供默认的无参构造方法，就需要手写一个无参构造方法
	public TypeA() {
		
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
