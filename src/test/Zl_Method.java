package test;

public class Zl_Method {
	double height = 175.6;//�������
	double weight;
	
	double getHeight(){  //��ķ���
		return height;
	}
	
	public static void main(String[] args) {
		Zl_Method Zl = new Zl_Method(); //������Ķ���
		System.out.print(Zl.getHeight());
	}
}
