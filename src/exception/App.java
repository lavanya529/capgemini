package exception;

import java.rmi.AccessException;

public class App {

	public static void main(String[] args) {
		System.out.println("start");
		try {
		System.out.println(2 / 0);
		}catch (ArithematicException e){
		
	}
	
	
		System.out.println("end");
}
}

