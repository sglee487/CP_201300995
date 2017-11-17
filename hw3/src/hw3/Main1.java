package hw3;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num0,num1,num2;
		num0 = 0;
		num1 = 1;
		System.out.print(num0 + " ");
		System.out.print(num1 + " ");
		for (int i=0; i<9;i++) {
		num2 = num0 + num1;
		System.out.print(num2 + " ");
		num0 = num1;
		num1 = num2;
		

		}
	}
}
