
public class t48a {
	public static void main(String[] args) {
		t48b tunaObj = new t48b(10);
		
		for(int i = 0; i<5; i++) {
			tunaObj.add();
			System.out.printf("%s",tunaObj);
		}
	}
}
