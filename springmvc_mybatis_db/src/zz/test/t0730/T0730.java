package zz.test.t0730;

public class T0730 {

	public static void main(String[] args) {

		Person z3 = new Person("zhang3", 1000);
		Person l4 = new Person("li4", 1000);
		
		int ret = transferAccounts(z3,l4,100);
		
		if (ret == 0) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
		
	}

	private static int transferAccounts(Person z3, Person l4, int diffMoney) {
		// TODO 自動生成されたメソッド・スタブ
		
		z3.setMoney(z3.getMoney()-diffMoney);
		l4.setMoney(l4.getMoney()+diffMoney);
		
		return 0;
	}

}

class Person {
	
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
