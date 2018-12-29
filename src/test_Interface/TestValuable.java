package test_Interface;

//ͬʱʵ�ֺͼ̳�,����ʱϵͳ����ʾ�����ĸ��࣬��TestValuable����GoldenMonkey

public interface TestValuable {
	public double getMoney();
	public static void main(String[] args) {
		TestValuable t = new GoldenMonkey();
		System.out.println(t.getMoney());
		
		Protectable p = (Protectable)t;
		p.beProtected();
	}
}

interface Protectable {
	public void beProtected();
}

interface A extends Protectable {
	void m();
}

abstract class Animal5 {
	private String name;
	abstract void enjoy();
}

class GoldenMonkey extends Animal5 implements TestValuable,Protectable {
	public double getMoney() {
		return 100000;
	}
	public void beProtected() {
		System.out.println("��˿�����ܱ�����");
	}
	public void enjoy() {
		System.out.println("��˿���ڽ�");
	}
	
}