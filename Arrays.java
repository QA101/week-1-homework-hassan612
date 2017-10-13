
public class Arrays {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		// Exercise 1
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);

		}
		System.out.println();
		System.out.println("#2");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println();
		System.out.println("#3");

		int product = 1;
		for (int i = 0; i < a.length; i++) {
			product = product * a[i];
		}
		System.out.println(product);

		System.out.println();
		System.out.println("#4");

		double[] b = { 1.2, 2.5, 3.8, -12 };
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
		System.out.println();
		System.out.println("#5");

		double[] c = { 1.2, -20, 3.89, 400.0 };
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.println("c[" + i + "] = " + c[i]);

		}
		System.out.println();
		System.out.println("#6");

		double[] d = { 1.0, 2.0, 3.89, 4.78 };
		double product2 = 1.0;
		String output = "";

		for (int i = 0; i < d.length; i++) {
			product2 = product2 * d[i];
			output += d[i];
			if (i != d.length - 1) {
				output += "*";
			}
		}
		System.out.println(output + "=" + product2);
		
		System.out.println();
		System.out.println("#7");
		
		double [] f = {4.86, 96.05, 22.83,-7.61};
		double sum = 1.0;
		
		for (int i = 0; i < f.length; i++) {
			sum += sum = f[i];
						
		}
		System.out.println("averag = " + sum/f.length);
	}
}
