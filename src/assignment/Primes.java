package assignment;

public class Primes {

	public static void main(String[] args) {
		int nValues = 50;
		outer:
			for (int i = 2; i <= nValues; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {					
					continue outer;
				}
			}
				System.out.println(i);
		}
	}
}