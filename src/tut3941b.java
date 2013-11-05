
public class tut3941b {
	private int hr;
	private int min;
	private int sec;
	
	public tut3941b() {
		this(0,0,0);
	}
	
	public tut3941b(int h) {
		this(h,0,0);
	}
	
	public tut3941b(int h, int m) {
		this(h,m,0);
	}
	
	public tut3941b(int h, int m, int s) {
		setTime(h,m,s);
	}

	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}

	public void setHour(int h) {
 		hr = ((h>=0&&h<24) ?h:0);
	}

	public void setMinute(int m) {
		min = ((m>=0&&m<60) ?m:0);
	}
	
	public void setSecond(int s) {
		sec = ((s>=0&&s<60) ?s:0);
	}
	
	public int getHour() {
		return hr;
	}
	
	public int getMinute() {
		return min;
	}
	
	public int getSecond() {
		return sec;
	}
	
	public String toMt(){
		return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
	}
}
