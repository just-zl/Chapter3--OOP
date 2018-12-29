package test_Extends;

//super¹Ø¼ü×Ö
class FatherClass {
	int value;
	public void f() {
		value = 100;
		System.out.println("FatherClass.value:"+value);
	}
}

class ChildClass extends FatherClass {
	protected int value;
	public void f() {
		super.f();
		value = 200;
		System.out.println("ChildClass.value"+value);
		System.out.println(value);
		System.out.println(super.value);
	}
}

public class TestInherit {
	public static void main(String args[]) {
		ChildClass child = new ChildClass();
		child.f();
	}
}
