package test;

//This¹Ø¼ü×Ö
public class TestLeaf {
	int i;
	TestLeaf (int i) {
		this.i = i;
	}
	
	TestLeaf increament() {
		i++;
		return this;
	}
	
	void print() {
		System.out.println("i="+i);
	}
	
	public static void main(String args[]) {
		TestLeaf leaf = new TestLeaf(100);
		leaf.increament().increament().print();
	}
}
