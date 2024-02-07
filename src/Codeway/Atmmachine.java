package Codeway;

import java.util.*;

public class Atmmachine {

	private double balance;

	public Atmmachine() {
		this.balance =0;

	}

	public void bank() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ATM MACHINE");
		System.out.println("1.DEPOSIT AMOUNT");
		System.out.println("2.WITHDRAW AMOUNT");
		System.out.println("3.CHECK BALANCE");
		System.out.println("4.EXIT");
		System.out.println("ENTER YOUR CHOICE:");
	}

	public void depositamount(double amount) {
		if (amount > 0) {
			balance+=amount;
			System.out.println(amount + "Deposited successfully");
		} else {
			System.out.println("Invalid amount");
		}
		
		
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <=balance
				) {
			balance -=amount;
			System.out.println("Amount withdraw successfully" + amount);
		} else {
			System.out.println("insufficient balance");
		}
	}

	public void checkbalance() {
		System.out.println("Total balance is" + balance);
	}

	public static void main(String[] args) {
				Atmmachine atmmachine=new Atmmachine();
				Scanner sc=new Scanner(System.in);
				
				int choice;
				do {
					atmmachine.bank();
				choice =sc.nextInt();
				switch (choice)
				{
				case 1:
					System.out.println("enter deposit amount");
					double depositamount=sc.nextDouble();
					atmmachine.depositamount(depositamount);
					break;
					
				case 2:
					System.out.println("withdraw Amount");
					
					double withdraw=sc.nextDouble();
					atmmachine.withdraw(withdraw);
					break;
				
				case 3:
					atmmachine.checkbalance();
					break;
					
				case 4:
					System.out.println("Thank you visit again");
					break;
					
					default:
						System.out.println("Invalid option");
					
			}}
				
				
				while(choice !=4);
				sc.close();
}
			}
