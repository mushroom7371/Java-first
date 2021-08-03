package ch07;

class TVCR extends Tv1 {	//다중상속이 불가능하기에 단일 상속 후 포함관계를 맺었다.
	VCR vcr = new VCR();	//클래스 내부에서 객체를 생성하기 때문에 포함관계와 같으므로 다중상속의 느낌을 내었다.
	
	void play() {	//메서드의 내용은 vcr이 가리키는 객체의 메서드를 호출한다.
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
}

class Tv1{	//상속받을 클래스에서 사용할 부모 클래스
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class VCR{	//다중 상속을 이용하고 싶지만 자바에서는 단일상속을 원칙으로 한다.
	boolean power;
	int counter = 0;
	
	void power(){power = !power;}
	//메서드 내용 생략
	void play() {}
	void stop()	{}
	void rew() {}
	void ff() {}
}
