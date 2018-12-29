package test_Static;

//static 关键字
public class Cat {
	static int sid = 0;//static 关键字，能声明一个类的对象所共有的属性。本例可用来增加Cat对象的id
	String name;
	int id;
	
	Cat(String name) {
		this.name = name;
		id = sid++;
	}
	
	void info() {
		System.out.println("name:"+name+",id:"+id);
	}
	
	public static void main(String arg[]) {
		Cat.sid = 100;   //在static方法中可以直接访问static类型的变量或方法
		Cat cat1 = new Cat("cat1");
		Cat cat2 = new Cat("cat2");
		cat1.info();
		cat2.info();
	}
}
