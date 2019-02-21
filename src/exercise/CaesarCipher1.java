package exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CaesarCipher1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//decrypt(encrypt("Hello-World-Java",3),3);
		try {
			FileInputStream fos = new FileInputStream("D:\\lavanya\\message.txt");
			System.out.println("enter message");
		    String x = sc. next();
			fos.write(x);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    try {
			FileInputStream pos = new FileInputStream("D:\\lavanya\\key.txt");
			System.out.println("enter key");
			int n = sc. nextInt();
			pos.write(n);
			pos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	private static void decrypt(StringBuilder encryptMsg, int n) {
		// TODO Auto-generated method stub
		String msg=encryptMsg.toString();
		char[] letters = msg.toCharArray();
		
		StringBuilder decryptedMsg = new StringBuilder();
		
		
		for (int i = 0; i < letters.length; i++) {
			decryptedMsg.append((char) (byte) (letters[i] - n));
		}
		System.out.println(decryptedMsg);
		
	}

	

	private static StringBuilder encrypt(String s, int n) {
		// TODO Auto-generated method stub
		StringBuilder encryptMsg=new StringBuilder();
		
		char[] letters = s.toCharArray();
		try {
			FileOutputStream nos = new FileOutputStream("D:\\lavanya\\enchypted.txt");
			System.out.println("enter integer");
			Scanner sc = null;
			String y = sc. next();
			nos.write(n);
			nos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < letters.length; i++) {
			encryptMsg.append((char) (byte) (letters[i] + n));
		}
		return encryptMsg;
	}

}
