import java.util.Scanner;							

public class tut7 {
	public static void main(String args[]) {
		Scanner bucky = new Scanner(System.in); 	
		double fnum, snum, anwser;					
		System.out.println("Enter first number:");
		fnum = bucky.nextDouble();
		System.out.println("Enter second number:");
		snum = bucky.nextDouble();
		anwser = fnum + snum;
		System.out.println(anwser);
	}
}
