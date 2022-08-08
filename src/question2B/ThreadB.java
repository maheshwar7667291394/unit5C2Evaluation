package question2B;

public class ThreadB extends Thread{
	@Override
	public void run() {
		b1.funB(a1);
	}
	A a1;
	B b1;
	public ThreadB(A a1, B b1) {
		super();
		this.a1 = a1;
		this.b1 = b1;
	}
	

}
