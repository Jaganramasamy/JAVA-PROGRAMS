package programs.cgt;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class printduplicates {
	public static void main(String[] args) {
		int[] A = {20,50,70,40,40,50};
		
		for (int i = 0; i < A.length; i++) {
			for (int j = i+1; j < A.length; j++) {
				if (A[i]==A[j]) {
					System.out.println(A[i]);
					
				}
				
			}
			
		}
		
		Set<Integer> collect = Arrays.stream(A).boxed().collect(Collectors.toSet());
		List<Integer> collect2 = Arrays.stream(A).boxed().collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println(collect);
		String valueOf = String.valueOf(collect);
		//arrays to string
	
	}

}
