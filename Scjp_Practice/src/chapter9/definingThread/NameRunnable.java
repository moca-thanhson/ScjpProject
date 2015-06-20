package chapter9.definingThread;

public class NameRunnable implements Runnable {
	
	/**
	 * Check con-currency execution of multiple thread through a loop
	 * */
	@Override
	public void run() {
		for(int i = 0 ;i<=3 ; i++) {
			System.out.println("Run by " + Thread.currentThread().getName() + ", i is : " + i);
		}
	}

}
