package test;

public class ZL_Fibnacci {

//递归方法实现斐波那契函数
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(5));
	}
	public static int f(int n) {
		if(n==1||n==2)	
			return 1;
		else if(n>2)
			return f(n-1)+f(n-2);
		else
			return -1;
	}*/

//非递归方法实现斐波那契函数
	public static void main(String args[]) {
		System.out.println(f(5));
	}

	public static double f(int n) {
		if(n==1||n==2)
			return 1;
		double f1=1;
		double f2=1;
		double f=0;
		for(int i=0;i<n-2;i++) {
			f=f1+f2;
			f1=f2;
			f2=f;
		}
		return f;
	}
}