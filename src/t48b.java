
public class t48b {
	private int sum;
	private final int NUM;
	
	
	public t48b(int x) {
		NUM = x;
	}
	
	public void add(){
		sum+=NUM;
	}
	
	public String toString(){
		return String.format("Sum = %d\n", sum);
	}
}
