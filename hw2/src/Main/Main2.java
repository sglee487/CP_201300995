
package Main;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1990년 01월 01일은 월요일
		
		//윤년인지 아닌지 계산하는
		//윤년은 366일, 평년은 365일
		
		//1991년 01월 01일은 1990년이 평년이기 때문에 365일
		//1992년 01월 01일은 1990년, 1991년이 평년이기 때문에 365일 + 365일
		//1993년 01월 01일은 1990년, 1991년이 평년, 1992년이 윤년이기 때문에 365일 + 365일 + 366일
		//1994년 01월 01일은 1990년이 평년이기 때문에 365일
		Scanner keyboard = new Scanner(System.in);
		int year;
		int month;
		int day;
		int allDay;
		int yunNum = 0;
		int pyunNum = 0;
		System.out.print("년도를 입력하세요: ");
		year = keyboard.nextInt();
		System.out.print("월을 입력하세요: ");
		month = keyboard.nextInt();
		System.out.print("일수를 입력하세요: ");
		day = keyboard.nextInt();

		for (int i = 1990; i< year;i++) {
		if (i % 400 == 0) {
			yunNum++;
			//System.out.println("윤년");
		}
		else if (i % 4 == 0 && i % 100 != 0) {
			yunNum++;
			//System.out.println("윤년");
		}
		else {
			pyunNum++;
			//System.out.println("평년");
		}
		}
		//allday += pyunNum*365 + yunNum*366
		
		//1월 입력하면 0
		//2월 입력하면 1*31 
		//3월 입력하면 2*31 -1 (-2) (-2)는 당해년이 평년
		//4월 입력하면 3*31 -1 (-2)
		//5월 입력하면 4*31 -2 (-2)
		//6월 입력하면 5*31 -2 (-2)
		//7월 입력하면 6*31 -3 (-2)
		//8월 입력하면 7*31 -3 (-2)
		//9월 입력하면 8*31 -3 (-2)
		//10월 입력하면 9*31 -4 (-2)
		//11월 입력하면 10*31 -4 (-2)
		//12월 입력하면 11*31 -5 (-2)
		
		
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
		if (year % 400 == 0)  //윤년
			allDay -= 1;
		
		else if (year % 4 == 0 && year % 100 != 0)  //윤년
			allDay -= 1;
		else
			allDay -= 2;
		
		//System.out.println("allDay" + allDay);
		//System.out.println("allDay % 7" + allDay%7);
		switch (allDay % 7) {
		case 0: System.out.println("월요일"); break;
		case 1: System.out.println("화요일"); break;
		case 2: System.out.println("수요일"); break;
		case 3: System.out.println("목요일"); break;
		case 4: System.out.println("금요일"); break;
		case 5: System.out.println("토요일"); break;
		case 6: System.out.println("일요일"); break;
		}
	
	}
}
