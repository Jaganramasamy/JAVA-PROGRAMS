package string.programs;

public class ToPrintUp {
	public static void main(String[] args) {
		String s = "kartHik RAJA";	
	
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
		
		if (Character.isUpperCase(c)) {
			System.out.println("capital -->"+c);
			
		}
	
		}
	}

}
