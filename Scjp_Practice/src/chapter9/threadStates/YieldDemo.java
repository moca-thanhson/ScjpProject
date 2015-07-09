package chapter9.threadStates;

public class YieldDemo {
	public static void main(String[] args) {
		StateThread staThread = new StateThread();
		Thread t1 = new Thread(staThread);
		t1.start();
		
		StateThreadFoo fooThread = new StateThreadFoo();
		Thread t2 = new Thread(fooThread);
		t2.start();
		
		System.out.println("preparing yield...");
		Thread.yield();
	}
}
