package test;

public class Zl_recursion {
	public static void main(String args[]) {
		System.out.println(Method(5));
	}
	public static int Method(int n) {
		if(n==1)
			return 1;
		else
			return n*Method(n-1);
	}
}
