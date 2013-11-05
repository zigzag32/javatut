
public class tut3941a {
	public static void main(String[] args){
		
		tut3941b tunaObject = new tut3941b();
		tut3941b tunaObject2 = new tut3941b(5);
		tut3941b tunaObject3 = new tut3941b(5,13);
		tut3941b tunaObject4 = new tut3941b(5,13,45);
		
		System.out.printf("%s\n", tunaObject.toMt());			// the % breaks from the "" the s stands for string then \n is for a new line
		System.out.printf("%s\n", tunaObject2.toMt());
		System.out.printf("%s\n", tunaObject3.toMt());
		System.out.printf("%s\n", tunaObject4.toMt());
	}
}
