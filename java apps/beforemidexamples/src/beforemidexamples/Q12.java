package beforemidexamples;
import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a three-digit integer: ");
		int num=input.nextInt();
		int num1=0,num2=0;
		if(num<=999&&num>=100) {
			num1=num%10;
			num2=num/100;
			//System.out.println("num1="+num1+" num2="+num2);
			if(num1==num2) {
				System.out.print(""+num+" is a palindrome");
			}
			else{
				System.out.print(""+num+" is not a palindrome");
			}
		}
		else {
			System.out.print("Please enter a valid number!");
		}

	}

}
