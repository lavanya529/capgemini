package PROGRAMS;
import java.io.Console;
public class Con1 {

	public static void main(String[] args) {
	String s =	System.console().readLine();   		
    System.out.println(s);
    
    char[] pass = System.console().readPassword();
    System.out.println(pass);
	}

}
