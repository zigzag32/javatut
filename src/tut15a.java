import java.util.Scanner;

public class tut15a {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		tut15b tunaObject = new tut15b ();
		
		System.out.println("enter your name here: ");
		String name = input.nextLine();
		
		tunaObject.simpleMessgae(name);
		
	}
}
