package test_Object;

public class TestEquals {

	public static void main(String[] args) {
		Mouse m1 = new Mouse("red",20,20);
		Mouse m2 = new Mouse("red",20,20);
		System.out.println(m1.equals(m2));
	}

}

class Mouse {
	private String  color;
	private double  weight,height;
	
	Mouse(String color,double weight,double height){
		this.color = color;
		this.weight = weight;
		this.height = height;
	}
	
	public boolean equals(Object obj) { //重写了Object类的equals（）方法，用来判断两个对象是否相同，如果单纯的用“m1==m2？”
										//来判断，则永远不会相同，因为这判断的是他们的引用对象的位置，即地址
		if(obj instanceof Mouse) {   //引用变量+instanceof+类名  判断该引用类型变量所“指向”的对象是否属于该类或该类的子类
			Mouse m = (Mouse)obj;
			if(m.color == this.color && m.weight == this.weight && m.height == this.height) {
				return true;
			}
		}
		return false;
	}
}
