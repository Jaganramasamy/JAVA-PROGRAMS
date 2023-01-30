package string.programs;

public class Vowels {
	public static void main(String[] args) {
		String s = "karthIKRaja";
		for (int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='O'||c=='I'||c=='E'||c=='U') {
				System.out.println("vowels--->"+c);
				
			}else {
				System.out.println("not vowels--->"+c);
			}
		}
	}

}
