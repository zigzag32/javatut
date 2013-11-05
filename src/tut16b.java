
public class tut16b {
	private String girlName;
	
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
