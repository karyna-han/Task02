package It.Ihu.unit02.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("������� �������� ������� ������: ");
		x = sc.nextInt();
		
		System.out.println("������ ����� ����� " + x);
		
		int y;
		
		
		System.out.print("������� �������� ������� ������: ");
		y = sc.nextInt();
		
		System.out.println("������ ����� ����� " + y);
		System.out.println("�������� ������� ��������, ������� ���������� ������������ ����� ����� ��������� ��� �������.");
		System.out.println("�������� ���������� �� ��������� ��� �������.");
		
		double h;
		
		h = Math.sqrt(x*x+y*y);
		
		System.out.printf("���������� �����: %.2f \n", h);
		System.out.println("�������! ������ ������ ������� ������������.");
		System.out.println("������� �������������� ������������ ����� �������� ������������ ��� �������.");
		
		int s;
		
		s = (x*y)/2;
		
		System.out.println("������� �������������� ������������ �����: " + s);
		

	}

}
