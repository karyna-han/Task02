package It.Ihu.unit02.main;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		System.out.println("¬ведите четыре целых числа: ");
		
		int number1 = sc.nextInt();
		sum += number1;
		
		int number2 = sc.nextInt();
		sum += number2;
		
		int number3 = sc.nextInt();
		sum += number3;
		
		int number4 = sc.nextInt();
		sum += number4;

		System.out.println("»х сумма равна: " + sum);
	}
}
