
public class First50Primes {
	public static void main(String[] args) {
		int sum = 0;
		int count = 1;
		int i = 2;
		while (count <= 50) {
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
				count++;
			}
			i++;
		}
		
		System.out.println(sum);
	}
}
