package ch07;

public class TimeTest {
	public static void main(String [] args) {
		Time t = new Time(12, 35, 30);
		System.out.println(t);
		// t.hour = 13; Time Ŭ������ ���� hour�� ���� �����ڰ� private �̹Ƿ� ���� �Ұ�
		t.setHour(t.getHour()+1); //private�� ���� �����ڸ� ���� ������ ���� �� �� �����Ƿ� 
		System.out.println(t);	  //�� ������ �ٷ�� ���Ͽ� public �޼��带 �̿��� 
	}
}	
class Time {
	private int hour, minute, second; //private ���� �����ڷ� �ش� Ŭ���������� ���� ������ ������

	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour(){ return hour; }	// Ÿ Ŭ�������� �����ϱ� ���Ͽ� public�� �����.
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}

	public int getMinute() { return minute; }
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) return;
		this.minute = minute;
	}

	public int getSecond() { return second; }
	public void setSecond(int second) {
		if(second < 0 || second > 59) return;
		this.second = second;
	}

	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}
