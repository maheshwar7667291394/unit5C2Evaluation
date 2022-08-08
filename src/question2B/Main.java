package question2B;

public class Main {
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		ThreadA ta=new ThreadA(a1, b1);
		ThreadB tb=new ThreadB(a1, b1);
		ta.start();
		tb.start();
	}

}
