package question2B;

public class A {
	public synchronized void funA(B b1) {
		System.out.println("funA of start");
		b1.fun2();
		System.out.println("funA of Ends");
		
	}
	public static void fun1() {
		System.out.println("inside fun1 of A");
	}
}
