package chapter9.definingThread;

public class LoopThread implements Runnable {
	@Override
	public void run() {
		for(int i = 0;i<= 20; i++) {
			System.out.println(Thread.currentThread().getName() + " , with i :" + i);
		}
	}
	
	public static void main(String[] args) {
		LoopThread loopRunnable = new LoopThread();
		
		Thread t1 = new Thread(loopRunnable);
		t1.setName("Fred");
		
		Thread t2 = new Thread(loopRunnable);
		t2.setName("John");
		
		Thread t3 = new Thread(loopRunnable);
		t3.setName("Ken");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
