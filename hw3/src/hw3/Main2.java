package hw3;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String ip;
		int mo=1;
		System.out.print("���ڸ� �Է��ϼ���. : ");
		ip = keyboard.nextLine();
		ip = ip.toLowerCase();
		switch (ip) {
		case "a": case "e": case "i": case "o": case "u": System.out.println("�����Դϴ�."); break;
		case "b": case "c": case "d": case "f": case "g": case "h": case "j": case "k": case "l": case "m": case "n": 
		case "p": case "q": case "r": case "s": case "t": case "v": case "w": case "x": case "y": case "z": System.out.println("�����Դϴ�."); break;
		}
	}
}
