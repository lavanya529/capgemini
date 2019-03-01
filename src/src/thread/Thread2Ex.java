package thread;

public class Thread2Ex {

	public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
	Thread thread = new Thread(new Task());
	
	}
	System.out.println("Thread Name: " + Thread.currentThread().getName());
	
	}
static class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		
		
	}
	
}
}
