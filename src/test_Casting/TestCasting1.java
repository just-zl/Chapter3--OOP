package test_Casting;

//对象转型

class Animal {
	public String name;
	Animal(String name) {
		this.name = name;
	}
}

class Sheep extends Animal {
	public String eyeColor;
	
	Sheep(String n,String c) {
		super(n);
		eyeColor = c;
	}
}

class Pig extends Animal {
	public String furColor;
	
	Pig(String n,String c) {
		super(n);
		furColor = c;
	}
}

public class TestCasting1 {

	public static void main(String[] args) {
		Animal animal = new Animal("name");
		Sheep sheep = new Sheep("sheepName", "white");
		Pig pig = new Pig("pigName", "pink");
		
		System.out.println(animal instanceof Animal);
		System.out.println(sheep instanceof Animal);
		System.out.println(pig instanceof Animal);
		//System.out.println(sheep instanceof Pig);
		
		animal = new Sheep("newSheepName","newWhite");  //将父类的animal对象重新指向子类的Sheep对象，但此时的animal
														//只能访问Animal类的属性，如name，而Sheep的eyeColor无法访问
		System.out.println(animal instanceof Animal);
		System.out.println(animal instanceof Sheep);
		System.out.println(animal.name);
		//System.out.println(animal.eyeColor);  //报错，因为此时的animal只是一只普通的Animal对象，他访问不到Animal子类新增的属性和方法
		Sheep sheep2 = (Sheep)animal; //强制类型转换？？？？？？？？？？？？？？？？？？？？？？
		System.out.println(sheep2.eyeColor); 
	}
}