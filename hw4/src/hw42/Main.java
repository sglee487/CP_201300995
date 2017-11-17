package hw42;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("문자열을 입력하십시오. ");
		String s = input.nextLine();
		for(int i = 0;i<=s.length()-1;i++){
			if (s.charAt(i)+0<91 && s.charAt(i)+0>64) {
				//대문자
				//소문자로 바꾸자
				System.out.print((char)(s.charAt(i)+32));
			}
			else if (s.charAt(i)+0>96 && s.charAt(i)+0<123) {
				//System.out.print("소문자다");
				System.out.print((char)(s.charAt(i)-32));
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
