
public class tut37b {
	private int hr;
	private int min;
	private int sec;
	
	public void setTime(int h, int m, int s) {
		hr = ( (h>=0 && h<24) ? h: 0);				//take the inputs and store them localy in this class for use
		min = ( (m>=0 && m<60) ? m: 0);
		sec = ( (s>=0 && s<60) ? s: 0);
	}
	
	public String toMt() {
		return String.format("%02d:%02d:%02d",hr, min, sec);			
	}
	
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hr == 0 || hr == 12) ? 12:hr%12), min, sec, (hr < 12 ? "AM": "PM"));
	}
}
