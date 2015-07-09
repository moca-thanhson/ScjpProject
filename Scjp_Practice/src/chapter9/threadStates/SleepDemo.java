package chapter9.threadStates;

public class SleepDemo implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Priority of child() thread is " + Thread.currentThread().getPriority());
		for(int i = 0 ; i < 100; i++){
			if(i % 10 == 0 ) {
				System.out.println("sleeping.. with num :" + i);
				try {
					Thread.sleep(500);
					System.out.println("waking up...");
				} catch (InterruptedException e) {
					System.err.println(e.getMessage());
				}
			}
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new SleepDemo());
		t.start();
		t.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Priority of main() thread is " + Thread.currentThread().getPriority());
		System.out.println("end of main thread()");
	}
	
}
