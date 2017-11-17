package Main;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String userChoice;
		//String comChoice;
		int comNum;
		int userWinCount = 0;
		int comWinCount = 0;
		for (int i = 1; i<8;i++) {
			comNum = (int)(Math.random()*10) + 1;
			System.out.print("ÀÔ·Â: ");
			userChoice = keyboard.nextLine();
			//System.out.print("ÀÔ·ÂµÈ °ª: ");
			//System.out.println(userChoice);
			if (userChoice.equals("°¡À§"))
				//System.out.println("°¡À§³¿");
				if (comNum == 1 || comNum == 4 || comNum == 7) {
					//ºñ±è
					System.out.println("ºñ°å´Ù!");
					System.out.println("stage " + i + " > user : " + userWinCount + "½Â vs computer " + comWinCount + "½Â");
				}
				else if (comNum == 2 || comNum == 5 || comNum == 8) {
					//System.out.println("Áü");
					System.out.println("Á³´Ù!");
					comWinCount++;
					System.out.println("stage " + i + " > user : " + userWinCount + "½Â vs computer " + comWinCount + "½Â");
				}
					else {
					//System.out.println("ÀÌ±è");
						System.out.println("ÀÌ°å´Ù!");
					userWinCount++;
					System.out.println("stage " + i + " > user : " + userWinCount + "½Â vs computer " + comWinCount + "½Â");
					}
			else if (userChoice.equals("¹ÙÀ§"))
				//System.out.println("¹ÙÀ§³¿");
				if (comNum == 1 || comNum == 4 || comNum == 7) {
					//System.out.println("ÀÌ±è");
					System.out.println("ÀÌ°å´Ù!");
					userWinCount++;
					System.out.println("stage " + i + " > user : " + userWinCount + "½Â vs computer " + comWinCount + "½Â");
					}
				else if (comNum == 2 || comNum == 5 || comNum == 8) {
					System.out.println("ºñ°å´Ù!");
					System.out.println("stage " + i + " > user : " + userWinCount + "½Â vs computer " + comWinCount + "½Â");
				}
				else {
					//System.out.println("Áü");
					System.out.println("Á³´Ù!");
					comWinCount++;
					System.out.println("stage " + i + " > user : " + userWinCount + "½Â vs computer " + comWinCount + "½Â");
				}
			else if (userChoice.equals("º¸"))
				//System.out.println("º¸³¿");
				if (comNum == 1 || comNum == 4 || comNum == 7) {
					//System.out.println("Áü");
					System.out.println("Á³´Ù!");
					comWinCount++;
					System.out.println("stage " + i + " > user : " + userWinCount + "½Â vs computer " + comWinCount + "½Â");
				}
				else if (comNum == 2 || comNum == 5 || comNum == 8) {
					//System.out.println("ÀÌ±è");
					System.out.println("ÀÌ°å´Ù!");
					userWinCount++;
					System.out.println("stage " + i + " > user : " + userWinCount + "½Â vs computer " + comWinCount + "½Â");
					}
				else {
					System.out.println("ºñ°å´Ù!");
					System.out.println("stage " + i + " > user : " + userWinCount + "½Â vs computer " + comWinCount + "½Â");
				}
			else
				System.out.println("Àß¸ø³Â½À´Ï´Ù.");
		}
		//°á°ú
		if (userWinCount > comWinCount)
			System.out.println("user");
		else if (userWinCount < comWinCount)
			System.out.println("computer");
		else
			System.out.println("ºñ±è");
	}

}

