package test;

//***********Point类*****************
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

//********Circle类*************
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
	
	Point1 getO() {  //返回了一个Point类对象（的引用），取名叫做o，可以用于单独取出点o的x值或y值
		return o;
	}
	double getRadius() {
		return radius;
	}
	
	double getArea() {          //返回该圆的面积
		return 3.14*radius*radius;
	}
	
	
	boolean contains(Point1 p) {   //判断一个圆对象是否包含一个点对象  s是第三人称
		double x = o.getX() - p.getX();  //点到圆心的距离  o是圆心
		double y = o.getY() - p.getY();
		if(x*x + y*y > radius*radius) return false; //radius只有Circle类才有，而o，p都不是Circle类，故后面需
												    //要构建一个Circle对象
		return true;
	}
}
//****************************

public class TestCircle {
	public static void main(String args[]) {
		Circle c1 = new Circle(new Point1(1.0,2.0),2.0);
		Circle c2 = new Circle(5.0);
		//打印c1和c2的坐标、半径和面积
		System.out.println("c1:("+c1.getO().getX()+","+c1.getO().getY()+"),"+c1.getRadius());
		System.out.println("c2:("+c2.getO().getX()+","+c2.getO().getY()+"),"+c2.getRadius());
		System.out.println("c1的面积"+c1.getArea());
		System.out.println("c2的面积"+c2.getArea());
		
		//改变c1、c2的属性,再打印他们的坐标、半径和面积
		c1.setO(5,6);
		c2.setRadius(9.0);
		System.out.println("c1:("+c1.getO().getX()+","+c1.getO().getY()+"),"+c1.getRadius());
		System.out.println("c2:("+c2.getO().getX()+","+c2.getO().getY()+"),"+c2.getRadius());
		System.out.println("c1的面积"+c1.getArea());
		System.out.println("c2的面积"+c2.getArea());
		
		//新建Point对象，判断圆对象是否包含点对象。即点p1是否在以c1为圆心的圆内
		Point1 p1 = new Point1(5.2,6.3);
		System.out.println(c1.contains(p1));
		System.out.println(c1.contains(new Point1(10.0,9.0)));
	}
}
