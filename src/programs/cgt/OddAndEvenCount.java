package programs.cgt;

public class OddAndEvenCount {
	static int even = 0;
	static int odd = 0;
	static int sum = 0;
	static int sum1 = 0;
	
	public static void main(String[] args) {
		for (int i = 1; i <=20; i++) {
			if (i%2==0) {
				System.out.println("even -"+i );
				even++;
				sum = sum+i;//to sum of even numbers
			} else {
				System.out.println("odd -"+i);
				odd++;
				sum1 = sum1+i;//to sum of odd numbers

			}
		}
		System.out.println("even count= "+even);
		System.out.println("odd count -"+ odd);
		System.out.println("sum of even no -"+sum);
		System.out.println("sum of odd no -"+sum1);

	}

}
