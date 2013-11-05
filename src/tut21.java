import java.util.Scanner;

public class tut21 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int avg;
		int counter = 0;
		
		while (counter < 10){
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		avg = total / 10;
		System.out.println(avg);				
	}
}
