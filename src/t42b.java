

public class t42b {
	private String name;
	private t42c birthday;
	
	public t42b(String theName, t42c theDate){
		name = theName;
		birthday = theDate;
	}
	
	public String toString(){
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
