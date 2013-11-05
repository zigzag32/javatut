
public class tut38b {
	private int hr = 1;
	private int min = 2;
	private int sec = 3;
	
	public void setTime(int hr, int min, int sec) {
		this.hr = 4;
		this.min = 5;
		this.sec = 6;
	}
	
	public String toMt() {
		return String.format("%02d:%02d:%02d",hr, min, sec);			
	}
	
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hr == 0 || hr == 12) ? 12:hr%12), min, sec, (hr < 12 ? "AM": "PM"));
	}
}
