package beforemidexamples;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		System.out.print("Miles\t   Kilometers");
		for(int x=1;x<=10;x++) {
			float y=(float) (x*1.609);
			System.out.println();
			System.out.printf("%d\t   %.3f",x,y);
			
		}
	}

}
