
public class tut34 {
	public static void main(String [] args) {
		int fa[][]={{8,9,10,11},{12,13,14,15}};			// two sets of multi dimentianal array
		int sa[][]={{30,31,32,33},{43},{4,5,6}};
		
		System.out.println("first array");
		display(fa);
		System.out.println();
		System.out.println("second array");
		display(sa);
	}
	
	public static void display(int x[][]) {				//new method to deal with multi dimentional arrays
		for(int row=0;row<x.length;row++) {						//THIS loops the rows 
			for(int column=0;column<x[row].length;column++) {	// this loops the columns
				System.out.print(x[row][column]+"\t");			//then we print out the numbres
			}
			System.out.println();								// then we starts a new line
		}
	}
}
//you just have to love arrays