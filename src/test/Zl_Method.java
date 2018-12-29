package test;

public class Zl_Method {
	double height = 175.6;//类的属性
	double weight;
	
	double getHeight(){  //类的方法
		return height;
	}
	
	public static void main(String[] args) {
		Zl_Method Zl = new Zl_Method(); //定义类的对象
		System.out.print(Zl.getHeight());
	}
}
