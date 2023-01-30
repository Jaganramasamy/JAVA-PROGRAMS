package string.programs;



public class reverseparticularword {
	public static void main(String[] args) {
		String s = "welcome to java class";
		String reverse = "";
		String[] split = s.split(" ");
		String s1 = split[2]; //take index
		for (int i = s1.length()-1; i >=0 ; i--) {
			reverse=reverse+s1.charAt(i);	
		}
		System.out.println(split[0]+" " +split[1]+" " +reverse+" " +split[3]);

		}
			
		}
	
