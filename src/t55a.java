
public class t55a {
	public static void main(String[] args){

		t55d bucky[] = new t55d[2];
		bucky[0] = new t55b();
		bucky[1] = new t55c();
		
		for (int x = 0; x<2;++x){
			bucky[x].eat();
		}
		
	}
}
