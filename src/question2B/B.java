package question2B;

public class B {
	public synchronized void funB(A a1) {
		System.out.println("FunB of staret");
		a1.fun1();
		 System.out.println("FunB of ends class");
	}
	public synchronized void fun2() {
		System.out.println("inside fun2 of B");
	}

}
