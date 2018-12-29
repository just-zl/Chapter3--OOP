package test;

public class TestOverLoad {
	public static void main(String args[]) {
		PersonInfo p1 = new PersonInfo();
		PersonInfo p2 = new PersonInfo(20);
		PersonInfo p3 = new PersonInfo(0, 18);
		
		p1.info();
		
		int age = 19;
		p3.setAge(age);
		p3.info();
		
		/*p3.setAge(age++);
		p3.info();
		System.out.println(age);*/
		
		p3.setAge(++age);
		p3.info();
		System.out.println(age);
	}
}

class PersonInfo{
	int id;
	int age;
	
//*****构造防范的重载*****************
	PersonInfo(){        
		id = 20;
		age = 18;
	}
	
	PersonInfo(int _age){
		id = 0;
		age = _age;
	}
	
	PersonInfo(int _id, int _age){
		id = _id;
		age = _age;
	}
//*******************************
	int getId() {
		return id;
	}
	
	int getAge() {
		return age;
	}
	
	void setId(int _id) {
		id = _id;
	}
	
	void setAge(int _age) {
		age = _age;
	}
//*********普通方法的重载******************
	void info() {
		System.out.println(id+" "+age);
	}
	
	void info(String s) {
		System.out.println(id+" "+age);
	}
//************************************
}