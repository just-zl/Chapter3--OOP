package test_Extends;

//继承中的构造方法
class SuperClass {
	private int n;
	
	SuperClass() {
		System.out.println("父类无参构造函数SuperClass()");
	}
	
	SuperClass(int n) {
		System.out.println("父类有参构造函数SuperClass("+n+")");
		this.n = n;
	}
}

class SubClass extends SuperClass {
	private int n;
	
	SubClass(){
		super(200); //调用父类带参数的构造方法SuperClass(int n)
		System.out.println("子类无参构造函数SubClass()");
	}
	
	SubClass(int n){  //此处未显示的调用父类的构造方法，则系统默认调用父类的无参构造方法SuperClass(),相当于super()
		System.out.println("子类有参构造函数SubClass("+n+")");
		this.n = n;
	}
}

public class TestSuperSub {
	public static void main(String args[]) {
		SubClass sub1 = new SubClass();
		SubClass sub2 = new SubClass(300);
		/*预计输出：
		父类有参构造函数SuperClass(200)
		子类无参构造函数SubClass()
		父类无参构造函数SuperClass()
		子类有参构造函数SubClass(300)*/
	}
}