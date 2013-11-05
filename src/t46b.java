public class t46b {
	private String first;
	private String last;
	private static int members = 0;
	
	public t46b(String fn, String ln) {
		first = fn;
		last = ln;
		members++;
		System.out.printf("Constrructor for %s %s, Members in the club: %d\n", first, last, members);
	}
	
	public String getF() {
		return first;
	}
	
	public String getL() {
		return last;
	}
	
	public static int getM() {
		return members;
	}
}
