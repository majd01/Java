package beforemidexamples;
import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x2= input.nextDouble();
		double y2= input.nextDouble();
		
		double x1=0,y1=0;
		
		double a = Math.pow((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)), 0.5);
		if(a<=10&&a>=-10) {
			System.out.printf("point (%.1f, %.1f) is in the circle",x2,y2);
		}
		else {
			System.out.printf("point (%.1f, %.1f) is not in the circle",x2,y2);
		}

	}

}
