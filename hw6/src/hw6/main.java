package hw6;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int song;
		
		BankAccount Account1 = new BankAccount();
		BankAccount Account2 = new BankAccount();
		
		System.out.println("����1 ���� �Է�");
		System.out.print("���¹�ȣ : ");
		Account1.accountNumber = keyboard.nextLine();
		System.out.print("������ : ");
		Account1.owner = keyboard.nextLine();
		System.out.print("�ʱ� �ܾ� : ");
		Account1.balance = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("����2���� �Է�");
		System.out.print("���¹�ȣ : ");
		Account2.accountNumber = keyboard.nextLine();
		System.out.print("������ : ");
		Account2.owner = keyboard.nextLine();
		System.out.print("�ʱ� �ܾ� : ");
		Account2.balance = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("");
		
		//�ϰ������ ����
		Account1.deposit(20000);
		Account2.withdraw(10000);
		System.out.println(Account1);
		System.out.println(Account2);
		//��
		System.out.println("");
		
		System.out.println("����1���� ����2�� �۱��� �ݾ� :");
		song = keyboard.nextInt();
		Account1.sendAccount(song, Account2);
		System.out.println("");
		System.out.println("=========================");
		
		System.out.println("����1");
		System.out.println("���� ��ȣ : " + Account1.accountNumber);
		System.out.println("������ : " + Account1.owner);
		System.out.println(Account1);
		System.out.println("");
		
		System.out.println("����2");
		System.out.println("���� ��ȣ : " + Account2.accountNumber);
		System.out.println("������ : " + Account2.owner);
		System.out.println(Account2);
	}

}

class BankAccount{
	String accountNumber;
	String owner;
	int balance;

	void deposit (int amount){
		balance += amount;
		System.out.println("�����߽��ϴ�. ���� �ܾ� : " + balance);
	}
	void withdraw (int amount){
		if (balance < amount) {
			System.out.println("�ܾ׺��� �� ���� ���� ���� ���մϴ�! ���� �ܾ� : " + balance);
		}
		else {
			balance -= amount;
			System.out.println("�����߽��ϴ�. ���� �ܾ� : " + balance);
		}
	}
	public String toString() {
		return "�ش���� �ܾ� : " + balance;
	}
	
	public int sendAccount(int amount, BankAccount otherAccount) {
		if (balance < amount) {
			System.out.println("����. �����ܾ׺��� �� ���� �ݾ��� �۱��߽��ϴ�.");
		}
		else {
			otherAccount.balance += amount;
			balance -= amount;
		}
		return 0;
	}
}