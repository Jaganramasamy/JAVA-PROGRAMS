package programs.cgt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class toprintcommonvalues {
	public static void main(String[] args) {
		int[] a = {3,5,7,9,1};
		int[] b = {3,4,5,6,2};	
	List<Integer> c1 = Arrays.stream(a).boxed().collect(Collectors.toList());	
	List<Integer> c2 = Arrays.stream(b).boxed().collect(Collectors.toList());	
	c1.retainAll(c2);
	System.out.println(c1);
	
	
	}

}
