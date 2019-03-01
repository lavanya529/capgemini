package thread;

public class ThreadPriority extends Thread{
	
	public void run(){
		String name = Thread.currentThread().getName();
		System.out.println("Thread name is:"+Thread.currentThread().getName());
		System.out.println("Thread priority of"+name);
		
	}

	public static void main(String[] args) {
		ThreadPriority m1= new ThreadPriority();
		ThreadPriority m2= new ThreadPriority();
		ThreadPriority m3= new ThreadPriority();
		
		m1.setPriority(MIN_PRIORITY);
		m1.start();
		
		m2.setPriority(MAX_PRIORITY);
		m2.start();
		
		m3.setPriority(NORM_PRIORITY);
		m3.start();
		
		
		
	}

}
