
public class tut17b {
	private String girlName;
	
	public tut17b(String name){		//creating a constructor allowing for the inilization of the object to have a value
		girlName=name;
	}
	
	public void setname(String name) {
		girlName = name;
		}
	
	public String getName() {
		return girlName;
		}
	
	public void saying(){
		System.out.printf("Your first GF was %s", getName() );
		}
}
