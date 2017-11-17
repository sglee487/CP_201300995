package hw43;
 
import java.util.Scanner;
 
public class TestDate {
 
	public static void main(String[] args) {
		int year;
		int month;
		int day;
		Date date = new Date();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("연도 입력: ");
		year = keyboard.nextInt();
		date.year = year;
		System.out.print("월 입력: ");
		month = keyboard.nextInt();
		date.month = month;
		System.out.print("일 입력: ");
		day = keyboard.nextInt();
		date.day = day;
		
		date.printEastern();
		date.printWestern();
	}
 
}