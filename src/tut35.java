
public class tut35 {
	public static void main(String [] args) {
		System.out.println(avg(43,70,30,40,20,500));
		
	}
	
	public static int avg(int...numbers){ //the ... indicates the unknows (number of arguments) amount of numbers to be used  its (type ... variable)
		int total=0;
		for(int x:numbers)
			total+=x;
			
		return total/numbers.length;
			
				
	}
}
