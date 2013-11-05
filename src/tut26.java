import java.util.Random;

public class tut26 {
	public static void main(String [] args) {
		Random dice = new Random();
		int number;
		
		for(int counter=1;counter<=10;counter++){
			number = 1+dice.nextInt(6);				// the 1+ give the illusion that the counter starts at 1 rather than 0
			System.out.println(number + " " );
		}
		
	}
}
