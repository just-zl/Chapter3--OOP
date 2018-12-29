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
	
	public boolean equals(Object obj) { //��д��Object���equals���������������ж����������Ƿ���ͬ������������á�m1==m2����
										//���жϣ�����Զ������ͬ����Ϊ���жϵ������ǵ����ö����λ�ã�����ַ
		if(obj instanceof Mouse) {   //���ñ���+instanceof+����  �жϸ��������ͱ�������ָ�򡱵Ķ����Ƿ����ڸ������������
			Mouse m = (Mouse)obj;
			if(m.color == this.color && m.weight == this.weight && m.height == this.height) {
				return true;
			}
		}
		return false;
	}
}
