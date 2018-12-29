package test_Interface;

interface petCare {
	public void feed();
	public void play();
}

class Farmer implements petCare {
	public void feed() {
		System.out.println("ũ��ιʳ����");
	}
	public void play() {
		System.out.println("ũ��ͳ�����");
	}
}

class Worker implements petCare {
	public void feed() {
		System.out.println("����ιʳ����");
	}
	public void play() {
		System.out.println("���˺ͳ�����");
	}
}

class Leader implements petCare {
	public void feed() {
		System.out.println("�쵼��ιʳ����");
	}
	public void play() {
		System.out.println("�쵼�ߺͳ�����");
	}
}

public class TestPractice {

	public static void main(String[] args) {
		petCare p1 = new Farmer();
		petCare p2 = new Worker();
		petCare p3 = new Leader();
		
		p1.feed();p1.play();
		p2.feed();p2.play();
		p3.feed();p3.play();

	}

}
