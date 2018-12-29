package test;

//空间点到原点的距离。法一
/*public class TestPoint {
	
	static double x;
	double y;
	double z;
	TestPoint(double _x,double _y,double _z){
		x = _x;
		y = _y;
		z = _z;
	}
	
	static void setX(double _x) {
		x = _x;
	}
	
	void setY(double _y) {
		y = _y;
	}
	
	void setZ(double _z) {
		z = _z;
	}
	
	static double distance(TestPoint d) {
		return d.x*d.x+d.y*d.y+d.z*d.z;
	}
	
	
	public static void main(String args[]) {
		TestPoint point = new TestPoint(3, 4, 5);
		System.out.println(distance(point));
		point.setY(5);
		System.out.println(distance(point));
	}
}*/

//法二

/*class Point{
	double x;
	double y;
	double z;
	Point(double _x,double _y,double _z){
		x = _x;
		y = _y;
		z = _z;
	}
	
	void setX(double _x){
		x = _x;
	}
	void setY(double _y){
		y = _y;
	}
	void setZ(double _z){
		z = _z;
	}
	
	void getDistance(){
		System.out.println(x*x+y*y+z*z);
	}
}

public class TestPoint{
	public static void main(String args[]) {
		Point p = new Point(3, 4, 5);
		p.getDistance();
		p.setX(4);
		p.getDistance();
	}
}*/


//法三：任意两点之间的距离，参考视频
class Point{
	double x;
	double y;
	double z;
	Point(double _x,double _y,double _z) {
		x = _x;
		y = _y;
		z = _z;
	}
	
	void setX(double _x) {
		x = _x;
	}
	void setY(double _y) {
		y = _y;
	}
	void setZ(double _z) {
		z = _z;
	}
	
	double getDistance(Point p) {
		return (x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z);
	}
}

public class TestPoint {
	public static void main(String args[]) {
		Point p1 = new Point(3, 4, 5);
		Point o = new Point(0, 0, 0);
		System.out.println(p1.getDistance(o));
		System.out.println(p1.getDistance(new Point(0, 0, 0)));
	}
}