package programs.cgt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class toprintnotcommonvalues {
	public static void main(String[] args) {
		int[]a= {1,2,3,4};
		int[]b= {1,2,3,5};
		
		List<Integer> c1 = Arrays.stream(a).boxed().collect(Collectors.toList());	
		List<Integer> c2 = Arrays.stream(b).boxed().collect(Collectors.toList());
		c1.removeAll(c2);
		//System.out.println(c1);
		c2.addAll(c1);
		System.out.println(c2);
		for (int i = 0; i < c2.size(); i++) {
			Integer c3 = c2.get(0);
			if (c3==1||c3==2||c3==3) {
				c2.remove(c3);
				System.out.println(c2);
			}
			
		}
	}

}
