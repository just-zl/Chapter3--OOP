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
		
		test.change1(date);//dateֻ�ǽ�ֵ������i�����Ǹı�i��ֵ������ı�date��ֵ
		test.change2(b1);  //��b1�������ָ�������ĵ�ַ������m�����Ǹı�mָ����µĶ���ĵ�ַ�����ı�b1��ֵ
		test.change3(b2);  //��b2�������ָ�������ĵ�ַ������n������n����changeDay�����������ı���b2��ָ��Ķ����dayֵ������b2��ֵ�ı�
		
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
