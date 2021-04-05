package It.Ihu.unit02.main;

public class Task06 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double d;
		
		double result;
		
		a = 8.0;
		b = 29.0; 
		c = 25.0; 
		d = 14.0;
		
		result = (a/c)*(b/d)-(a*b-c)/(c*d);
		
		System.out.printf("result = %.3f", result);

	}

}
