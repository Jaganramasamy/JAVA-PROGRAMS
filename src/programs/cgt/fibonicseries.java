package programs.cgt;

public class fibonicseries {
	//1,2+1=3,3+2=5,4+3=7...........
	
	public static void main(String[] args) {
		int a=0,b=1;
		for (int i = 2; i <=10; i++) {
			
			int c = a+b; //c=1,a=0,b=1
			System.out.println(c);
			a=b; //a=0 to 1
			b=c; //b=1 to 1
			
		}
	}

}
