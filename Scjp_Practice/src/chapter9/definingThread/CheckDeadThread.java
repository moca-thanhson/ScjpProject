package chapter9.definingThread;

class DeadRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Dead runnable is running...");
	}
}

public class CheckDeadThread {
	public static void main(String[] args) {
		DeadRunnable dr = new DeadRunnable();
		Thread t = new Thread(dr);
		System.out.println("Id of thread is " + t.getId());
		t.start();
		
		System.out.println("Main thread with id is : " + Thread.currentThread().getId() + " is running...");
		if(t.isAlive()) {
			t.start(); //will throw exception IllegalThreadStateException here 
					   // one thread has been started , it can never be started again
		}
		System.out.println("Main thread is stopping..");
	}
}
