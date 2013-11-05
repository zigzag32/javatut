//animal list
public class t59e {

	private t59d[] thelist = new t59d[5];
	private int i = 0;
	
	public void add(t59d a) {
		if (i < thelist.length) {
			thelist[i] = a;
			System.out.println("Animal added at index " +i);
			i++;
		}
	}
}
