package It.Ihu.unit02.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("Введите значение первого катета: ");
		x = sc.nextInt();
		
		System.out.println("Первый катет равен " + x);
		
		int y;
		
		
		System.out.print("Введите значение второго катета: ");
		y = sc.nextInt();
		
		System.out.println("Второй катет равен " + y);
		System.out.println("Согласно теореме Пифагора, квадрат гипотенузы треугольника равен сумме квадратов его катетов.");
		System.out.println("Вычислим гипотенузу по известной нам теореме.");
		
		double h;
		
		h = Math.sqrt(x*x+y*y);
		
		System.out.printf("Гипотенуза равна: %.2f \n", h);
		System.out.println("Отлично! Теперь найдем площадь треугольника.");
		System.out.println("Площадь прямоугольного треугольника равна половине произведения его катетов.");
		
		int s;
		
		s = (x*y)/2;
		
		System.out.println("Площадь прямоугольного треугольника равна: " + s);
		

	}

}
