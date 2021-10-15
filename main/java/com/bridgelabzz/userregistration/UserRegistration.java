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

		System.out.println("Enter your Email ID : ");
		String email = sc.nextLine();
		System.out.println(
				Pattern.matches("\"^([a][b][c])([\\\\.][a-z]+)[@][b][l][\\\\.][c][o]([\\\\.][i][n])\"", email));

	}
}
