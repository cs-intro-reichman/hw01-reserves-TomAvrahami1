/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class Triangle {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		boolean triangle = ((a + b > c) && (a + c > b) && (b + c > a));
		System.out.println(a + ", " + b + ", " + c + ": " + triangle);
	}
}