package com.yasir.bankAccount;

import java.util.Scanner;

public class Customer {

	public Customer(Account mockAccount) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		Account account1 = new Account();
		for (int i = 1; i <= 4; i++) {
		System.out.println("\nEnter one of these options: "
				+ "\n1- for view your current balance"
				+ "\n2- for deposite"
				+ "\n3- for withdraw"
				+ "\n4- for balance after modified");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.print("your current balance is: "+ account1.getBalance());
			
			break;
		case 2:
			System.out.println("Enter the ammount to deposite: ");
			double in = input.nextDouble();
			account1.deposite(in);
			System.out.println("your balance after deposite: "+ account1.getBalance());
			break;
		case 3:
			System.out.println("Enter the ammount to withdraw: ");
			double in1 = input.nextDouble();
			account1.withdraw(in1);
			System.out.println("your balance after deposite: "+ account1.getBalance());
			break;
		}
		}

	}

}
