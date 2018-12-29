package test_Interface;

//接口
interface Singer {
	//public static final int i; 会报错，因为接口中只有抽象方法和常量，而i未初始化
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
	
	//重写Singer接口中的方法
	public void sing() {
		System.out.println("学生在唱歌");
	}
	public void sleep() {
		System.out.println("学生在睡觉");
	}
}

class Teacher4 implements Singer,Drawer {
	private String name;
	
	Teacher4(String name) {
		this.name = name;
	}
	
	//重写Singer接口中的方法
	public void sing() {
		System.out.println("老师在唱歌");
	}
	public void sleep() {
		System.out.println("老师在睡觉");
	}
	
	//重写Drawer接口中的方法
	public void draw() {
		System.out.println("老师在画画");
	}
	public void eat() {
		System.out.println("老师在吃东西");
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
		Drawer d = (Drawer)s2; //Singer 接口的引用为什么可以强制转换成Drawer 接口的引用
		//((Drawer) s2).draw();
		//System.out.println(s2 instanceof Singer);
		d.draw();
		d.eat();
	}

}
