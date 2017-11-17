package hw6;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int song;
		
		BankAccount Account1 = new BankAccount();
		BankAccount Account2 = new BankAccount();
		
		System.out.println("계좌1 정보 입력");
		System.out.print("계좌번호 : ");
		Account1.accountNumber = keyboard.nextLine();
		System.out.print("예금주 : ");
		Account1.owner = keyboard.nextLine();
		System.out.print("초기 잔액 : ");
		Account1.balance = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("계좌2정보 입력");
		System.out.print("계좌번호 : ");
		Account2.accountNumber = keyboard.nextLine();
		System.out.print("예금주 : ");
		Account2.owner = keyboard.nextLine();
		System.out.print("초기 잔액 : ");
		Account2.balance = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("");
		
		//하고싶은거 넣자
		Account1.deposit(20000);
		Account2.withdraw(10000);
		System.out.println(Account1);
		System.out.println(Account2);
		//끝
		System.out.println("");
		
		System.out.println("계좌1에서 계좌2로 송금할 금액 :");
		song = keyboard.nextInt();
		Account1.sendAccount(song, Account2);
		System.out.println("");
		System.out.println("=========================");
		
		System.out.println("계좌1");
		System.out.println("계좌 번호 : " + Account1.accountNumber);
		System.out.println("예금주 : " + Account1.owner);
		System.out.println(Account1);
		System.out.println("");
		
		System.out.println("계좌2");
		System.out.println("계좌 번호 : " + Account2.accountNumber);
		System.out.println("예금주 : " + Account2.owner);
		System.out.println(Account2);
	}

}

class BankAccount{
	String accountNumber;
	String owner;
	int balance;

	void deposit (int amount){
		balance += amount;
		System.out.println("저금했습니다. 현재 잔액 : " + balance);
	}
	void withdraw (int amount){
		if (balance < amount) {
			System.out.println("잔액보다 더 많은 돈은 인출 못합니다! 현재 잔액 : " + balance);
		}
		else {
			balance -= amount;
			System.out.println("인출했습니다. 현재 잔액 : " + balance);
		}
	}
	public String toString() {
		return "해당계좌 잔액 : " + balance;
	}
	
	public int sendAccount(int amount, BankAccount otherAccount) {
		if (balance < amount) {
			System.out.println("오류. 계좌잔액보다 더 많은 금액을 송금했습니다.");
		}
		else {
			otherAccount.balance += amount;
			balance -= amount;
		}
		return 0;
	}
}