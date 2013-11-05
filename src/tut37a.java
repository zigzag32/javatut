
public class tut37a {
	public static void main(String[] args){
		
		tut37b tunaObject = new tut37b();
		
		System.out.println(tunaObject.toMt());			//out put defailts
		System.out.println(tunaObject.toString());
		
		tunaObject.setTime(20, 27, 6);					// setting the times
		
		System.out.println(tunaObject.toMt());
		System.out.println(tunaObject.toString());
	}
}
