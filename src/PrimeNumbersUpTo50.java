public class PrimeNumbersUpTo50 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 2; i < 50; i++) {
			boolean isPrime = true;
			int j = 2;
			while (j <= i/2 && isPrime) {
				if (i%j == 0)
					isPrime = false;
				j++;
			}
			
			if (isPrime) {
				// System.out.println(i);
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
