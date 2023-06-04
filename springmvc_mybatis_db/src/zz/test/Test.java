package zz.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Dog d=null;
		d.call();

		Animal a = new Cat();
		Animal b = new Dog();

		List<Animal> lst = new ArrayList<>();

		lst.add(a);
		lst.add(b);

		for (Animal animal : lst) {
			animal.call();
		}

	}
}

interface Animal {
	public void call();
}

class Cat implements Animal{

	@Override
	public void call() {
		System.out.println("miao");
	}
}

class Dog implements Animal {

	@Override
	public void call() {
		System.out.println("wang");
	}

}
