package beforemidexamples;

public class Q15 {

	public static void main(String[] args) {
		int a,b;
		for(a=1,b=7;a<=7;a++,b--) {
			for(int c=0;c<=b;c++) {
				System.out.print("  ");
			}
			for(int d=a;d>=1;d--) {
				System.out.print(""+d+" ");
			}
			for(int e=2;e<=a;e++) {
				System.out.print(""+e+" ");
			}
			System.out.println();
		}

	}

}
