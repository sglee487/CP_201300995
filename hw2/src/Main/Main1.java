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
			System.out.print("�Է�: ");
			userChoice = keyboard.nextLine();
			//System.out.print("�Էµ� ��: ");
			//System.out.println(userChoice);
			if (userChoice.equals("����"))
				//System.out.println("������");
				if (comNum == 1 || comNum == 4 || comNum == 7) {
					//���
					System.out.println("����!");
					System.out.println("stage " + i + " > user : " + userWinCount + "�� vs computer " + comWinCount + "��");
				}
				else if (comNum == 2 || comNum == 5 || comNum == 8) {
					//System.out.println("��");
					System.out.println("����!");
					comWinCount++;
					System.out.println("stage " + i + " > user : " + userWinCount + "�� vs computer " + comWinCount + "��");
				}
					else {
					//System.out.println("�̱�");
						System.out.println("�̰��!");
					userWinCount++;
					System.out.println("stage " + i + " > user : " + userWinCount + "�� vs computer " + comWinCount + "��");
					}
			else if (userChoice.equals("����"))
				//System.out.println("������");
				if (comNum == 1 || comNum == 4 || comNum == 7) {
					//System.out.println("�̱�");
					System.out.println("�̰��!");
					userWinCount++;
					System.out.println("stage " + i + " > user : " + userWinCount + "�� vs computer " + comWinCount + "��");
					}
				else if (comNum == 2 || comNum == 5 || comNum == 8) {
					System.out.println("����!");
					System.out.println("stage " + i + " > user : " + userWinCount + "�� vs computer " + comWinCount + "��");
				}
				else {
					//System.out.println("��");
					System.out.println("����!");
					comWinCount++;
					System.out.println("stage " + i + " > user : " + userWinCount + "�� vs computer " + comWinCount + "��");
				}
			else if (userChoice.equals("��"))
				//System.out.println("����");
				if (comNum == 1 || comNum == 4 || comNum == 7) {
					//System.out.println("��");
					System.out.println("����!");
					comWinCount++;
					System.out.println("stage " + i + " > user : " + userWinCount + "�� vs computer " + comWinCount + "��");
				}
				else if (comNum == 2 || comNum == 5 || comNum == 8) {
					//System.out.println("�̱�");
					System.out.println("�̰��!");
					userWinCount++;
					System.out.println("stage " + i + " > user : " + userWinCount + "�� vs computer " + comWinCount + "��");
					}
				else {
					System.out.println("����!");
					System.out.println("stage " + i + " > user : " + userWinCount + "�� vs computer " + comWinCount + "��");
				}
			else
				System.out.println("�߸��½��ϴ�.");
		}
		//���
		if (userWinCount > comWinCount)
			System.out.println("user");
		else if (userWinCount < comWinCount)
			System.out.println("computer");
		else
			System.out.println("���");
	}

}

