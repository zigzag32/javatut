
public class tut12 {
	public static void main(String args[]) {
		int age;
		age = 5;
		
		switch (age) {									// switch statment is like an if but allows for more cases in simpler jargen.
		case 1:
			System.out.println("you can crawl");
			break;
		case 2:
			System.out.println("you can talk");
			break;
		case 3: 
			System.out.println("you can get in trouble");
			break;
		default:
			System.out.println("I dont know your age?");
			break;
			
		}
	}
}
