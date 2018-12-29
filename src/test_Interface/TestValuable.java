package test_Interface;

//同时实现和继承,运行时系统会提示运行哪个类，是TestValuable还是GoldenMonkey

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
		System.out.println("金丝猴是受保护的");
	}
	public void enjoy() {
		System.out.println("金丝猴在叫");
	}
	
}