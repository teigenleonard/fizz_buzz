package fizz_buzz;

public class FizzBuzz {
	public static void main(String[], args) {
		for (int i = 0; i <=100; i++) {
			if (i % 3 === 0) {
				System.out.println("FIZZ");
			} else if ( i % 5 === 0) {
				System.out.println("BUZZ");
			} else if ( i % (3 * 5) === 0) {
				System.out.println("FIZZBUZZ");
			} else {
				System.out.println(i);
		}
	}
}