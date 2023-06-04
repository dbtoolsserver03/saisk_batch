package zz.test;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List<People> lst = new ArrayList<>();

		People objA = new People("zhang3", 20);
		People objB = new People("li4", 30);

		lst.add(objA);
		lst.add(objB);

		for ( People o : lst) {
			System.out.println(o);
		}

	}

}

class People {

	public String name;
	public int age;
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}



}
