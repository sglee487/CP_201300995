package hw43;

public class Date {
	int year;
	int month;
	int day;
	String WestMonth;
	
	
	public void printEastern() {
		System.out.println("����� ��¥ ǥ��: " + year + ". " + month + ". " + day);
	}
	
	public void printWestern() {
		switch (month) {
		case 1: WestMonth = "January"; break;
		case 2: WestMonth = "February"; break;
		case 3: WestMonth = "March"; break;
		case 4: WestMonth = "April"; break;
		case 5: WestMonth = "May"; break;
		case 6: WestMonth = "June"; break;
		case 7: WestMonth = "July"; break;
		case 8: WestMonth = "August"; break;
		case 9: WestMonth = "September"; break;
		case 10: WestMonth = "October"; break;
		case 11: WestMonth = "November"; break;
		case 12: WestMonth = "December"; break;
		}
		System.out.println("�̱��� ��¥ ǥ��: " + WestMonth + " " + day + ", " + year);
	}
}
