package test_Interface;

interface petCare {
	public void feed();
	public void play();
}

class Farmer implements petCare {
	public void feed() {
		System.out.println("农民喂食宠物");
	}
	public void play() {
		System.out.println("农民和宠物玩");
	}
}

class Worker implements petCare {
	public void feed() {
		System.out.println("工人喂食宠物");
	}
	public void play() {
		System.out.println("工人和宠物玩");
	}
}

class Leader implements petCare {
	public void feed() {
		System.out.println("领导者喂食宠物");
	}
	public void play() {
		System.out.println("领导者和宠物玩");
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
