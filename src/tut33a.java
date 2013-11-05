
public class tut33a {
	
	public static void main(String [] args) {
		int bucky[] = {3,4,5,6,7};
		change(bucky);						// take out array and pass it on to a new method called change
		
		for(int y:bucky){
			System.out.println(y);
		}
	}
	
	public static void change(int x[]){						
		for(int counter=0;counter<x.length;counter++){  //once every thing has run here its passed back to main
			x[counter]+=5;
		}
	}
}
