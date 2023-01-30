package programs.cgt;

import java.util.Arrays;

public class sort {
	public static void main(String[] args) {
		int[] a = {10,2,5,79,67,31};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
