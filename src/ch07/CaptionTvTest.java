package ch07;

public class CaptionTvTest {
	public static void main(String [] args) {
		CaptionTv ctv = new CaptionTv();	//Tv클래스를 상속받은 Caption 클래스에서 객체를 생성하였음.
		ctv.channel = 10;	// 조상 클래스에 선언된 int 타입의 메모리공간 channel에 10을 넣음.
		ctv.channelup();	// 조상 클래스의 메서드를 호출하여 channel값을 1 증가 시킴
		System.out.println(ctv.channel);
		ctv.displyCaption("Hellow, World");	// 자손 클래스의 메서드를 호출 하였으나 caption의 초기값이 false이므로 출력되지 않음
		ctv.caption = true;
		ctv.displyCaption("Hellow, World");	
	}
}

	class Tv{
		boolean power;	//인스턴스 변수,  boolean 타입의 power을 선언
		int channel;	//인스턴스 변수, int 타입의 channel을 선언
		
		void power() { power = !power; }	//인스턴스 메서드 
		void channelup() { ++channel; }
		void channeldown() { --channel; }
	}
	
	class CaptionTv extends Tv{	//Tv 클래스를 상속 받는 CaptionTv 클래스 안에 Tv 클래스의 인스턴스 변수와 인스턴스 메서드들이 들어있다
		boolean caption;
		void displyCaption(String text) {
			if(caption) {
				System.out.println(text);
			}
		}
	}
