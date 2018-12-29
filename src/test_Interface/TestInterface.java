package test_Interface;

//�ӿ�
interface Singer {
	//public static final int i; �ᱨ����Ϊ�ӿ���ֻ�г��󷽷��ͳ�������iδ��ʼ��
	public void sing();
	public void sleep();
}

interface Drawer {
	public void draw();
	public void eat();
}

class Student4 implements Singer {
	private String name;
	Student4(String name){
		this.name = name;
	}
	
	//��дSinger�ӿ��еķ���
	public void sing() {
		System.out.println("ѧ���ڳ���");
	}
	public void sleep() {
		System.out.println("ѧ����˯��");
	}
}

class Teacher4 implements Singer,Drawer {
	private String name;
	
	Teacher4(String name) {
		this.name = name;
	}
	
	//��дSinger�ӿ��еķ���
	public void sing() {
		System.out.println("��ʦ�ڳ���");
	}
	public void sleep() {
		System.out.println("��ʦ��˯��");
	}
	
	//��дDrawer�ӿ��еķ���
	public void draw() {
		System.out.println("��ʦ�ڻ���");
	}
	public void eat() {
		System.out.println("��ʦ�ڳԶ���");
	}
}

public class TestInterface {

	public static void main(String[] args) {
		Singer s1 = new Student4("zhangli");
		Singer s2 = new Teacher4("zhangyan");
		s1.sing();
		s1.sleep();
		s2.sing();
		s2.sleep();
		//System.out.println(s2 instanceof Singer);
		Drawer d = (Drawer)s2; //Singer �ӿڵ�����Ϊʲô����ǿ��ת����Drawer �ӿڵ�����
		//((Drawer) s2).draw();
		//System.out.println(s2 instanceof Singer);
		d.draw();
		d.eat();
	}

}
