package chapter9.definingThread;

public class NameThread {
	public static void main(String[] args) {
		NameRunnable nr = new NameRunnable();
		Thread t = new Thread(nr);
		t.start(); // will display default name of Thread
		
		System.out.println("Thread '" + Thread.currentThread().getName() + "'" +  " running..");
	}
}
