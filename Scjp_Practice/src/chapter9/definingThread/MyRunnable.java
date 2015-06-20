package chapter9.definingThread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Import job running in MyRunnable with name " + Thread.currentThread().getName());
	}

}
