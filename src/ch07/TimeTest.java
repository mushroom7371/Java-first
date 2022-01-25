package ch07;

public class TimeTest {
	public static void main(String [] args) {
		Time t = new Time(12, 35, 30);
		System.out.println(t);
		// t.hour = 13; Time 클래스의 변수 hour의 접근 제어자가 private 이므로 변경 불가
		t.setHour(t.getHour()+1); //private의 접근 제어자를 가진 변수를 변경 할 수 없으므로 
		System.out.println(t);	  //이 변수를 다루기 위하여 public 메서드를 이용함 
	}
}	
class Time {
	private int hour, minute, second; //private 접근 제어자로 해당 클래스에서만 변수 접근이 가능함

	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour(){ return hour; }	// 타 클래스에서 접근하기 위하여 public를 사용함.
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
