package programs.cgt;

public class SwappingWith3rdVariable {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		
		System.out.println(a);
		System.out.println(b);
		
		c=a; //c=10,a=10
		
		
		a=b; //a=10 to 20,c=10
		
		
		b=c; //b=20 to 10
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
