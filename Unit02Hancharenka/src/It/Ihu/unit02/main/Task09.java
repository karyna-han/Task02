package It.Ihu.unit02.main;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;		
		double fx;
		
		sc = new Scanner(System.in);
		
		System.out.print("Введите значение x: ");
				x = sc.nextInt();
		do {
			while (x > -3 && x <= 3 ) {
				System.out.println("Значение не соответствует ни одному из условий. Вычислить значение функции нельзя.");
				sc = new Scanner(System.in);
				
				System.out.print("Введите значение x: ");
						x = sc.nextInt();
						}
		if (x <= -3 && x > 3) {
			break;
			}

		
		if (x <= -3) {
			fx = 9;
			System.out.println("F(x) = " + fx);
			}
		
		if (x > 3) {
			fx = 1/(Math.pow(x, 2) + 1);
			System.out.println("F(x) = " + fx);
		} {
			break;
			}
		
		} while(true);
				
	}
}