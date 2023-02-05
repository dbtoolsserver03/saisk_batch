package jp.co.yahoo.hw.ym20230205.saisk.test.cls;






// class 前面有abstract 的话，就是抽象类。多数里面有没有被实现的方法。
// 抽象类不可以被实例化  new Animal2();

// 继承抽象类的类，一定要实现抽象类里面没有被实现的方法才可以实例化对象。



public abstract class Animal2 implements IObj {
	protected void run () {
		System.out.println("run");
	}
	protected void run2 () {
		System.out.println("run2");
	}

}


