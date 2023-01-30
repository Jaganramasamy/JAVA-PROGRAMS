package string.programs;

public class adds {
	public static void main(String[] args) {

		String a = "$123";
		String b = "$321";
		String s = a.substring(1);
		String s1 = b.substring(1);
		int a1 = Integer.parseInt(s);
		int b1 = Integer.parseInt(s1);
		int c = a1+b1;
		String ad ="$"+c;
		System.out.println(ad);	
	}
}
