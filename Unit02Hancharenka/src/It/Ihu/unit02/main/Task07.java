package It.Ihu.unit02.main;

public class Task07 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		
		a = 0.38;
		b = -0.24;
		c = 0.44;
		
		if (a > 0) {
			a = Math.pow(a, 2);
		} else {
			a = Math.pow(a, 4);
		}
		System.out.println("a = " + a);
		
		if (b > 0) {
			b = Math.pow(b, 2);
		} else {
			b = Math.pow(b, 4);
		}
		System.out.println("b = " + b);
		
		if (c > 0) {
			c = Math.pow(c, 2);
		} else {
			c = Math.pow(c, 4);
		}
		System.out.println("c = " + c);
	}

}
