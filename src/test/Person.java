package test;

public class Person {
	int id;
	int age;
	
	Person(int _id,int _age) { //构造方法，不带返回值
		id = _id;
		age = _age;
	}
	
	public static void main(String args[]) {
		Person tom = new Person(1,22);
		Person jerry = new Person(2,23);
		System.out.print(tom.id);
	}
}
