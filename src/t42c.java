

public class t42c {
	private int month;
	private int day;
	private int year;
	
	public t42c (int m, int d, int y){
		month = m;
		day = d;
		year = y;
		
		System.out.printf("the constructor for this is %s\n", this);
	}
	
	public String toString(){
		return String.format("%d/%d/%d", month,day,year);
	}
}
