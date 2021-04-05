package It.Ihu.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner sc;
		int a;
		
		sc = new Scanner(System.in);
		
		System.out.print("Введите первое значение: ");
		a = sc.nextInt();
		
		int b;
		
		sc = new Scanner(System.in);
		System.out.print("Введите второе значение: ");
		b = sc.nextInt();
		
		int c;
		
		sc = new Scanner(System.in);
		System.out.print("Введите третье значение: ");
		c = sc.nextInt();
		
		double s;
		s = Math.pow(a, 2)-(b-c)*(b-c)+Math.log(b*b+1);
		System.out.printf("Значение заданного выражения равно: %.2f", s);

	}

}
