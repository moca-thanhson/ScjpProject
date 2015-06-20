package chapter9.definingThread;

public class ManyNames {
	public static void main(String[] args) {
	    //Make one Runnable 
		NameRunnable nr = new NameRunnable();
		
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		
		one.setName("Fred");
		two.setName("Lucy");
		three.setName("Ricky");
		
		one.start();
		two.start();
		three.start();
		
		//will output display not the same after each run
    }
}