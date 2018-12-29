package test_Extends;

//构造方法的继承之super和this关键字的使用
//************父类Human类********************
class Human {
	private String name;
	private String location;
	
	Human(String name) {
		this.name = name;
		location = "Beijing";
	}
	
	Human(String name,String locatin) {
		this.name = name;
		this.location = locatin;
	}
	
	public String info() {
		return "name:"+name+",location:"+location;
	}
}

//*************子类NewStudent类*********************
class NewStudent extends Human {
	private String school;
	NewStudent(String name,String location,String school) {
		super(name,location);  //调用父类的构造方法
		this.school = school;
	}
	NewStudent(String name,String school){
		this(name, "Beijing", school);  //调用本类的另外的构造方法
	}
	
	public String info() {  //方法的重写，名称、参数列表、返回类型必须一致
		return super.info()+",shool:"+school;
	}
}

//***************子类NewTeacher类***********************
class NewTeacher extends Human {
	private String profession ; //职称 也可用capital
	
	NewTeacher(String name,String location,String profession) {
		super(name, location);
		this.profession = profession;
	}
	
	NewTeacher(String name,String profession) {
		this(name, "Beijing", profession);
	}
	
	public String info() {
		return super.info()+",profession:"+profession;
	}
}

public class TestPractice {
	public static void main(String args[]) {
		Human h1 = new Human("A");
		Human h2 = new Human("B","ShangHai");
		NewStudent s1 = new NewStudent("C","S1");
		NewStudent s2 = new NewStudent("D","ShangHai", "S2");
		NewTeacher t1 = new NewTeacher("E","Math");
		NewTeacher t2 = new NewTeacher("F","ShangHai","Chinese");
 		
		System.out.println(h1.info());
		System.out.println(h2.info());
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(t1.info());
		System.out.println(t2.info());
	}
}
