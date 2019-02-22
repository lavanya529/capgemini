package com.bank.view;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import com.bank.model.User;

public class View {

	static int count=1;
	
	public static User setInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the details"+count);
		User user= new User();
		user.setFirstName(sc.next());
		user.setLastName(sc.next());
		user.setAadharcardNo(sc.nextLong());
		user.setAccountNo(sc.nextLong());
		user.setAccountType(sc.next());
	    user.setPancardNo(sc.next());
	    user.setPhoneNo(sc.nextLong());
	    user.setAddress(sc.next());
	    
	    count++;
	    return user;
	}
	
	public static void main(String[] args) {
		ArrayList<User> us = new ArrayList<User>();
		us.add(setInfo());
		us.add(setInfo());
		
		FileOutputStream fos = new FileOutputStream("D:\\Registration)
		
		
		
	}

}
