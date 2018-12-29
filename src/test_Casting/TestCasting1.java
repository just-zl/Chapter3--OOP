package test_Casting;

//����ת��

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
		
		animal = new Sheep("newSheepName","newWhite");  //�������animal��������ָ�������Sheep���󣬵���ʱ��animal
														//ֻ�ܷ���Animal������ԣ���name����Sheep��eyeColor�޷�����
		System.out.println(animal instanceof Animal);
		System.out.println(animal instanceof Sheep);
		System.out.println(animal.name);
		//System.out.println(animal.eyeColor);  //������Ϊ��ʱ��animalֻ��һֻ��ͨ��Animal���������ʲ���Animal�������������Ժͷ���
		Sheep sheep2 = (Sheep)animal; //ǿ������ת����������������������������������������������
		System.out.println(sheep2.eyeColor); 
	}
}