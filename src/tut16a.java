import java.util.Scanner;


public class tut16a {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		tut16b tunaObject = new tut16b ();
		System.out.println("Enter first gf name here: ");
		String temp = input.nextLine();
		tunaObject.setname(temp);
		tunaObject.saying();
	}
}
