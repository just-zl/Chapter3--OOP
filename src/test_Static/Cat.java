package test_Static;

//static �ؼ���
public class Cat {
	static int sid = 0;//static �ؼ��֣�������һ����Ķ��������е����ԡ���������������Cat�����id
	String name;
	int id;
	
	Cat(String name) {
		this.name = name;
		id = sid++;
	}
	
	void info() {
		System.out.println("name:"+name+",id:"+id);
	}
	
	public static void main(String arg[]) {
		Cat.sid = 100;   //��static�����п���ֱ�ӷ���static���͵ı����򷽷�
		Cat cat1 = new Cat("cat1");
		Cat cat2 = new Cat("cat2");
		cat1.info();
		cat2.info();
	}
}
