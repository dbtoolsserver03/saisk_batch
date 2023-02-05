package jp.co.yahoo.hw.ym20230205.saisk.test.cls;

import java.util.Date;

// 一个类可以实现多个接口，但只可以继承一个类（类可以是抽象类也可以是正常类）
public class Person extends Animal implements IObj,IObj2  {

	protected String sei;
	protected String mei;
	protected String nickname;
	protected Date birthday;
	
	
    private void callPrivate() {
		
		System.out.println("name is : "+this.nickname);
	}
    
    void callDefault() {
		
    	callPrivate();
		System.out.println("name is : "+this.mei);
	}
	
	protected void callProtected() {
		
		System.out.println("name is : "+this.sei);
	}
		
	public void calPublic() {
		
		System.out.println("name is : "+this.sei + this.mei);
	}

	@Override
	protected void talk() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("call absract class method");
	}

	@Override
	public void callWeight() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void callWeight2() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
}
