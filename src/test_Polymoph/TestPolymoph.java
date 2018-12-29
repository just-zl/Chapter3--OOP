package test_Polymoph;

//多态

abstract class Animals {   //定义了一个抽象类
	private String name;
	Animals(String name) {
		this.name = name;
	}
	
	public abstract void enjoy();  //有一个抽象方法，只需声明，不需实现
}

class Dogs extends Animals {
	private String furColor;
	Dogs(String name,String furColor) {
		super(name);
		this.furColor = furColor;
	}
	
	public void enjoy() {
		System.out.println("狗的叫声");
	}
}

class Cats extends Animals {
	private String eyeColor;
	Cats(String name,String eyeColor) {
		super(name);
		this.eyeColor = eyeColor;
	}
	
	public void enjoy() {
		System.out.println("猫的叫声");
	}
}

class Lady {
	private String name;
	private Animals pet;
	
	Lady(String n,Animals pet) {
		this.name = n;
		this.pet = pet;
	}
	
	public void myPetEnjoy() {
		pet.enjoy();
	}

/*  如果不使用多态，Lady每养一只宠物，就得新建一些成员变量和方法
 * 	private Cats c;
	Lady(String name,Cats c){
		this.name = name;
		this.c = c;
	}
	public void myCatEnjoy() {
		c.enjoy();
	}
	
	private Dogs d;
	Lady(String name,Dogs d){
		this.name = name;
		this.d = d;
	}
	public void myDogEnjoy() {
		d.enjoy();
	}*/
}

public class TestPolymoph {
	public static void main(String args[]) {
		Dogs dog = new Dogs("dogName","black");
		Cats cat = new Cats("catName", "blue");
		Lady l1 = new Lady("l1", dog);
		Lady l2 = new Lady("l2", cat);
		l1.myPetEnjoy();
		l2.myPetEnjoy();
	}
}
