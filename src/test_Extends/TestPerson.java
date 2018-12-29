package test_Extends;

//ÀàµÄ¼Ì³Ð
//***************¸¸Àà********************
class Person {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getInfo() {
		return "name:"+name+",age:"+age;
	}
}
//*************************************
class Student extends Person {
	private String school;
	
	public void setSchool(String school) {
		this.school = school;
	}
	public String getSchool() {
		return school;
	}
	
	public String getInfo() {
		return "name:"+getName()+",age:"+getAge()+",school:"+school;
	}
}

public class TestPerson {
	public static void main(String args[]) {
		Student stu = new Student();
		stu.setName("ZL");
		stu.setAge(22);
		stu.setSchool("WHPU");
		
		/*System.out.println(stu.getName());
		System.out.println(stu.getAge());
		System.out.println(stu.getSchool());*/
		
		Person per = new Person();
		per.setName("ZY");
		per.setAge(26);
		
		System.out.println(per.getInfo());
		System.out.println(stu.getInfo());
	}
}
