package string.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Charsstring {
	public static void main(String[] args) {
		String v = "There is a light";
		char ascii = ' ';
		int i1 = 0;
		List<Integer> l = new ArrayList<>();
			for (int i =0; i < v.length(); i++) {
				char c1 = v.charAt(i);
				int ascii1 = (int)c1;
				//System.out.println(ascii);
				l.add(ascii1);
				}
				Collections.sort(l);
				System.out.println(l);
				for (int i = 0; i < l.size(); i++) {
					i1 = l.get(l.size()-1);
					ascii = (char)i1;
				}
				System.out.println(ascii + "-"+ i1 );
			}
		}