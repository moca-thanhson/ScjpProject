package chapter9.definingThread;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Important job running in MyThread with name " + this.getName());
	}
}
