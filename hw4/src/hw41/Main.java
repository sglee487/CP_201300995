package hw41;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int monum=0, janum=0;
		Scanner input = new Scanner(System.in);
		System.out.print("문자열을 입력하십시오. ");
		String s = input.nextLine();
		
		s = s.toLowerCase();
		for(int i = 0;i<=s.length()-1;i++ ){
			if (s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='u' ){
				monum++;
			}
			else if (s.charAt(i)=='b' ||s.charAt(i)=='c' ||s.charAt(i)=='d' ||s.charAt(i)=='f' ||s.charAt(i)=='g' ||s.charAt(i)=='h' ||s.charAt(i)=='j' ||s.charAt(i)=='k' ||s.charAt(i)=='l' ||s.charAt(i)=='m' ||s.charAt(i)=='n' ||s.charAt(i)=='p' ||s.charAt(i)=='q' ||s.charAt(i)=='r' ||s.charAt(i)=='s' ||s.charAt(i)=='t' ||s.charAt(i)=='v' ||s.charAt(i)=='w' ||s.charAt(i)=='x' ||s.charAt(i)=='y' ||s.charAt(i)=='z'){
				janum++;
			}
		}
		System.out.println("자음의 개수: " + janum);
		System.out.println("모음의 개수: " + monum);
	}
}
