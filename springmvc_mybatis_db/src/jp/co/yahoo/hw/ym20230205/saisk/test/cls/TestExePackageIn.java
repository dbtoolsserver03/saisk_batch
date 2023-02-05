package jp.co.yahoo.hw.ym20230205.saisk.test.cls;

public class TestExePackageIn {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person zhang3 = new Person();
		zhang3.talk();
		zhang3.run();
		
		// 如果是Private 编译失败，不可视。其他三种是可以访问的
		// zhang3.callPrivate();
		
		// Man 继承了People 除了Private的所有方法和属性
		Man man = new Man();
		// man.callPrivate();
		
		// 抽象类，生成不了对象。
	    // Animal animal = new Animal();
	}

}
