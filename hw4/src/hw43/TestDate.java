package hw43;
 
import java.util.Scanner;
 
public class TestDate {
 
	public static void main(String[] args) {
		int year;
		int month;
		int day;
		Date date = new Date();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		year = keyboard.nextInt();
		date.year = year;
		System.out.print("�� �Է�: ");
		month = keyboard.nextInt();
		date.month = month;
		System.out.print("�� �Է�: ");
		day = keyboard.nextInt();
		date.day = day;
		
		date.printEastern();
		date.printWestern();
	}
 
}