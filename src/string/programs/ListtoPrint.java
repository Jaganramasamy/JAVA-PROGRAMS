package string.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListtoPrint {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(20);
		l.add(40);
		l.add(30);
		
		List<Integer> p = new ArrayList<>();	
		p.addAll(l);
		//System.out.println(p);
		p.retainAll(l);
		System.out.println(p);
		p.removeAll(l);
		System.out.println(p);

		
	}

}
