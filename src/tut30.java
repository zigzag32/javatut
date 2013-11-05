import java.util.Random;
import java.util.Scanner;

public class tut30 {
	public static void main(String [] args) {
		Random rand = new Random();
		int freq[] = new int [7];
		int sum = 0;
		int perct = 0;
		int num = 100;
		
		Scanner bun = new Scanner(System.in);
		System.out.println("Please enter the number of roles you wish to make: ");
		num=bun.nextInt();
		
		for(int role=1;role<num;role++){
			++freq[1+rand.nextInt(6)];
		}
		
		System.out.println("Face\t Frequency\t Percent");
		
		for(int face=1;face<freq.length;face++){
			System.out.println(face+"\t "+freq[face] +"\t\t " +(100*freq[face]/num));			
		}
	
	}
}
