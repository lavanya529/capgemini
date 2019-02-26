package thread;


 class Thread1 extends Thread {

	public void run() {
		
		for(int i=0;i<50;i++) {
		System.out.println("Thread 1 called");	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
 }
	class Thread2 extends Thread {

		public void run() {
			
			for(int i=0;i<50;i++) {
			System.out.println("Thread 2 called");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
		}
	}
	public class ThreadExtend{
	public static void main(String[] args) {
	
Thread1 thread1 = new Thread1();
Thread2 thread2 = new Thread2();

thread1.start();
thread2.start();
	}
}	
