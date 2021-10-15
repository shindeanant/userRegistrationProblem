package com.bridgelabzz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name : ");
		String firstName = sc.nextLine();
		System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));

		System.out.println("Enter your Last Name : ");
		String LastName = sc.nextLine();
		System.out.println(Pattern.matches("[A-Z][a-z]{2,}", LastName));
	}
}
