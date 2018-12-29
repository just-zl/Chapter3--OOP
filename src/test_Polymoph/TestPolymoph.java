package test_Polymoph;

//��̬

abstract class Animals {   //������һ��������
	private String name;
	Animals(String name) {
		this.name = name;
	}
	
	public abstract void enjoy();  //��һ�����󷽷���ֻ������������ʵ��
}

class Dogs extends Animals {
	private String furColor;
	Dogs(String name,String furColor) {
		super(name);
		this.furColor = furColor;
	}
	
	public void enjoy() {
		System.out.println("���Ľ���");
	}
}

class Cats extends Animals {
	private String eyeColor;
	Cats(String name,String eyeColor) {
		super(name);
		this.eyeColor = eyeColor;
	}
	
	public void enjoy() {
		System.out.println("è�Ľ���");
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

/*  �����ʹ�ö�̬��Ladyÿ��һֻ����͵��½�һЩ��Ա�����ͷ���
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
