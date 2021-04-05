package It.Ihu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		double result;
		
		a = 0.5;
		b = 7.7;
		c = 2.0;
		
		result = (b + Math.log (( Math.pow(b, 2)) + ( 4 * a * c )) / ( 2 * a )) - (Math.pow(a, 3) * c + b);
		
		System.out.printf("Результатом ваших невероятных вычислений становится число %.2f", result);
		

	}

}
