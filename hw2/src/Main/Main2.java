
package Main;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1990�� 01�� 01���� ������
		
		//�������� �ƴ��� ����ϴ�
		//������ 366��, ����� 365��
		
		//1991�� 01�� 01���� 1990���� ����̱� ������ 365��
		//1992�� 01�� 01���� 1990��, 1991���� ����̱� ������ 365�� + 365��
		//1993�� 01�� 01���� 1990��, 1991���� ���, 1992���� �����̱� ������ 365�� + 365�� + 366��
		//1994�� 01�� 01���� 1990���� ����̱� ������ 365��
		Scanner keyboard = new Scanner(System.in);
		int year;
		int month;
		int day;
		int allDay;
		int yunNum = 0;
		int pyunNum = 0;
		System.out.print("�⵵�� �Է��ϼ���: ");
		year = keyboard.nextInt();
		System.out.print("���� �Է��ϼ���: ");
		month = keyboard.nextInt();
		System.out.print("�ϼ��� �Է��ϼ���: ");
		day = keyboard.nextInt();

		for (int i = 1990; i< year;i++) {
		if (i % 400 == 0) {
			yunNum++;
			//System.out.println("����");
		}
		else if (i % 4 == 0 && i % 100 != 0) {
			yunNum++;
			//System.out.println("����");
		}
		else {
			pyunNum++;
			//System.out.println("���");
		}
		}
		//allday += pyunNum*365 + yunNum*366
		
		//1�� �Է��ϸ� 0
		//2�� �Է��ϸ� 1*31 
		//3�� �Է��ϸ� 2*31 -1 (-2) (-2)�� ���س��� ���
		//4�� �Է��ϸ� 3*31 -1 (-2)
		//5�� �Է��ϸ� 4*31 -2 (-2)
		//6�� �Է��ϸ� 5*31 -2 (-2)
		//7�� �Է��ϸ� 6*31 -3 (-2)
		//8�� �Է��ϸ� 7*31 -3 (-2)
		//9�� �Է��ϸ� 8*31 -3 (-2)
		//10�� �Է��ϸ� 9*31 -4 (-2)
		//11�� �Է��ϸ� 10*31 -4 (-2)
		//12�� �Է��ϸ� 11*31 -5 (-2)
		
		
		//allday += (month-1)*31 - ((month-1)/2) if (month < 8)
		//allday += (month-1)*31 - ((month-2)/2) if (month >= 8) 
		
		//allday += day -1
		if (month < 8) 
			allDay = pyunNum*365 + yunNum*366 + (month-1)*31 - ((month-1)/2) + (day-1);
		 else 
			allDay = pyunNum*365 + yunNum*366 + (month-1)*31 - ((month-2)/2) + (day-1);
		
		//System.out.println(((month-1)/2));
		//System.out.println(((month-1)/2));
		if (month >2) 
		if (year % 400 == 0)  //����
			allDay -= 1;
		
		else if (year % 4 == 0 && year % 100 != 0)  //����
			allDay -= 1;
		else
			allDay -= 2;
		
		//System.out.println("allDay" + allDay);
		//System.out.println("allDay % 7" + allDay%7);
		switch (allDay % 7) {
		case 0: System.out.println("������"); break;
		case 1: System.out.println("ȭ����"); break;
		case 2: System.out.println("������"); break;
		case 3: System.out.println("�����"); break;
		case 4: System.out.println("�ݿ���"); break;
		case 5: System.out.println("�����"); break;
		case 6: System.out.println("�Ͽ���"); break;
		}
	
	}
}
