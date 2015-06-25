package chapter9.definingThread;

public class TestThread {
	public static void main(String[] args) {
	    MyRunnable myRn = new MyRunnable();
	    
	    Thread foo = new Thread(myRn);
	    foo.setName("Foo");
	    
	    Thread bar = new Thread(myRn);
	    bar.setName("Bar");
	    
	    Thread bat = new Thread(myRn);
	    bat.setName("Bat");
	    
	    Thread myThread = new MyThread();
	    myThread.setName("myThread");
	    
	    foo.start();
	    bar.start();
	    bat.start();
	    myThread.start();
	    
	    
	    
    }
}
