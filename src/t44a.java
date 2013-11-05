import java.util.EnumSet;				// this allows for you to look ata range of the constants from Enum

public class t44a {
	public static void main(String[] args){
		
		for(t44b people: t44b.values()){
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(),people.getYear());	
		}
		System.out.println("\nAnd now for the Range of constants!!!!\n");
		
		for(t44b people: EnumSet.range(t44b.kelsy, t44b.candy))
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(),people.getYear());
	}
}
