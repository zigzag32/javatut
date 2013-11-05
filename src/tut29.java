
public class tut29 {
	public static void main(String [] args) {
		int bucky[] = {21,166,86,21,3};
		int sum=0;
		int avg=0;
		
		for(int counter=0;counter<bucky.length;counter++)
			sum+=bucky[counter];
			avg= sum/bucky.length;
		
		System.out.println(+avg);
	}
}