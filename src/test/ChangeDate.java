package test;

class BirthDay{
	int day;
	int month;
	int year;
	
	BirthDay(int d,int m,int y){
		day = d;
		month = m;
		year = y;
	}
	
	void setDay(int _day) {
		day = _day;
	}
	
	void setMonth(int _month) {
		month = _month;
	}
	
	void setYear(int _year) {
		year = _year;
	}
	
	int getDay() {
		return day;
	}
	
	int getMonth() {
		return month;
	}
	
	int getYear() {
		return year;
	}
	
	void display() {
		System.out.println(day+"-"+month +"-"+year);
	}
}

public class ChangeDate {
	public static void main(String args[]) {
		int date = 9;
		ChangeDate test = new ChangeDate();
		BirthDay b1 = new BirthDay(1,11,1968);
		BirthDay b2 = new BirthDay(5,1,1969);
		
		test.change1(date);//date只是将值传给了i，但是改变i的值，不会改变date的值
		test.change2(b1);  //将b1所保存的指向其对象的地址传给了m，但是改变m指向的新的对象的地址，不改变b1的值
		test.change3(b2);  //将b2所保存的指向其对象的地址传给了n，但是n利用changeDay（）方法，改变了b2所指向的对象的day值，所以b2的值改变
		
		System.out.println(date);
		b1.display();
		b2.display();
	}
	
	void change1(int i) {
		i = 1234;
	}
	
	void change2(BirthDay m) {
		m = new BirthDay(27,1,1992);
	}
	
	void change3(BirthDay n) {
		n.setDay(22);
	}
}
