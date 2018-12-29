package test_Extends;

class Parent {
	private   int n_private = 1;
			  int n_default = 2;
	protected int n_protected = 3;
	public    int n_public = 4;
}

class Child extends Parent {
	public void m() {
		//n_private = 10;
		n_default = 20;
		n_protected = 30;
		System.out.println(n_default);
		System.out.println(n_protected);
		System.out.println(n_public);
	}
}

public class TestExtends {
	public static void main(String args[]) {
		Child c = new Child();
		c.m();
	}
	
}
