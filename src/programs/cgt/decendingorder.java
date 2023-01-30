package programs.cgt;

import java.util.Arrays;

public class decendingorder {
	public static void main(String[] args) {
		int [] a = {20,60,40,70,30};
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;			
				}
			}
			System.out.println(a[i]);
		}
		System.out.println(a[a.length-2]);//2nd mini
		
		
	}


}
