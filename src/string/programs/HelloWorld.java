package string.programs;

public class HelloWorld {
	public static void main(String[] args) {
		String s = "Hello world";
		String[] split = s.split(" ");
		for (int i = 1; i >= 0; i--) {
			System.out.println(split[i]);
		}
	
	}

}