package hw5;

public class main {

	public static void main(String[] args) {
		int[] num = new int[10];
		int big=0;
		int small=100;
		for (int i=0;i<10;i++) 
			num[i] = ((int)((Math.random()*101)));
		for (int i=0;i<10;i++) {
			if (num[i]>big)
				big = num[i];
			if (num[i] < small)
				small = num[i];
		}
		System.out.println("10개의 수 중 가장 큰 숫자: " +  big);
		System.out.println("10개의 수 중 가장 작은 숫자: " +  small);
	}

}
