package test_Extends;

//�̳��еĹ��췽��
class SuperClass {
	private int n;
	
	SuperClass() {
		System.out.println("�����޲ι��캯��SuperClass()");
	}
	
	SuperClass(int n) {
		System.out.println("�����вι��캯��SuperClass("+n+")");
		this.n = n;
	}
}

class SubClass extends SuperClass {
	private int n;
	
	SubClass(){
		super(200); //���ø���������Ĺ��췽��SuperClass(int n)
		System.out.println("�����޲ι��캯��SubClass()");
	}
	
	SubClass(int n){  //�˴�δ��ʾ�ĵ��ø���Ĺ��췽������ϵͳĬ�ϵ��ø�����޲ι��췽��SuperClass(),�൱��super()
		System.out.println("�����вι��캯��SubClass("+n+")");
		this.n = n;
	}
}

public class TestSuperSub {
	public static void main(String args[]) {
		SubClass sub1 = new SubClass();
		SubClass sub2 = new SubClass(300);
		/*Ԥ�������
		�����вι��캯��SuperClass(200)
		�����޲ι��캯��SubClass()
		�����޲ι��캯��SuperClass()
		�����вι��캯��SubClass(300)*/
	}
}