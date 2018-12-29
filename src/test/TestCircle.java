package test;

//***********Point��*****************
class Point1 {
	double x;
	double y;
	Point1(double _x,double _y) {
		x = _x;
		y = _y;
	}
	
	void setX(double _x) {
		x = _x;
	}
	
	void setY(double _y) {
		y = _y;
	}
	
	double getX(){
		return x;
	}
	
	double getY() {
		return y;
	}
}
//*****************************

//********Circle��*************
class Circle {
	Point1 o;
	double radius;
	
	Circle(Point1 p,double r) {
		o = p;
		radius = r;
	}
	Circle(double r) {
		o = new Point1(0.0, 0.0);
		radius = r;
	}
	
	
	void setRadius(double r) {
		radius = r;
	}
	void setO(double _x,double _y) {
		o.setX(_x);
		o.setY(_y);
	}
	
	Point1 getO() {  //������һ��Point����󣨵����ã���ȡ������o���������ڵ���ȡ����o��xֵ��yֵ
		return o;
	}
	double getRadius() {
		return radius;
	}
	
	double getArea() {          //���ظ�Բ�����
		return 3.14*radius*radius;
	}
	
	
	boolean contains(Point1 p) {   //�ж�һ��Բ�����Ƿ����һ�������  s�ǵ����˳�
		double x = o.getX() - p.getX();  //�㵽Բ�ĵľ���  o��Բ��
		double y = o.getY() - p.getY();
		if(x*x + y*y > radius*radius) return false; //radiusֻ��Circle����У���o��p������Circle�࣬�ʺ�����
												    //Ҫ����һ��Circle����
		return true;
	}
}
//****************************

public class TestCircle {
	public static void main(String args[]) {
		Circle c1 = new Circle(new Point1(1.0,2.0),2.0);
		Circle c2 = new Circle(5.0);
		//��ӡc1��c2�����ꡢ�뾶�����
		System.out.println("c1:("+c1.getO().getX()+","+c1.getO().getY()+"),"+c1.getRadius());
		System.out.println("c2:("+c2.getO().getX()+","+c2.getO().getY()+"),"+c2.getRadius());
		System.out.println("c1�����"+c1.getArea());
		System.out.println("c2�����"+c2.getArea());
		
		//�ı�c1��c2������,�ٴ�ӡ���ǵ����ꡢ�뾶�����
		c1.setO(5,6);
		c2.setRadius(9.0);
		System.out.println("c1:("+c1.getO().getX()+","+c1.getO().getY()+"),"+c1.getRadius());
		System.out.println("c2:("+c2.getO().getX()+","+c2.getO().getY()+"),"+c2.getRadius());
		System.out.println("c1�����"+c1.getArea());
		System.out.println("c2�����"+c2.getArea());
		
		//�½�Point�����ж�Բ�����Ƿ��������󡣼���p1�Ƿ�����c1ΪԲ�ĵ�Բ��
		Point1 p1 = new Point1(5.2,6.3);
		System.out.println(c1.contains(p1));
		System.out.println(c1.contains(new Point1(10.0,9.0)));
	}
}
