package JavaStudy;

class MyTv2{
	
	private boolean isPowerOn;	//private 제어자로 인하여 현재 클래스에서만 사용가능
	private int channel;		
	private int volume;			
	private int prevChannel;	//이전 channel을 저장하기 위한 변수 선언
	
	final int MAX_VOLUME = 100;		//상수로 선언 및 초기화 이 변수의 값은 변하지 않는다.
	final int MIN_VOLUME = 0;		
	final int MAX_CHANNEL = 100;	
	final int MIN_CHANNEL = 1;		
	
	public void setChannel(int channel) {	//타클래스에서 private 제어자로 선언한 변수를 접근하고 바꿔주기 위한 메서드
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)	//매개변수로 넘겨받은 값의 유효성을 판한하기 위한 조건문
			return;	//메서드를 void 타입으로 선언하였기에 return값이 없다.
		
		prevChannel = this.channel;	//이전 channel로 돌아가기 위해 바뀌기전인 현재 channel의 값을 저장한다.
		this.channel = channel;	//조건문에 부합하지 않는다면 MyTv2 클래스의 변수 channel에 매개변수로 받은 정수값을 대입한다.
	}
	public int getChannel() {
		return this.channel;	//set메서드로 설정한 변수의 값을 읽어오는데 필요한 메서드 접근제어자를 public으로 선언하였기에 어디서든 사용가능하다.
	}
	
	public void setVolume(int volume) {	//위의 메서드 들과 동일한 내용
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
		return;
		
		this.volume = volume;
	}
	public int getVolume() {
		return this.volume;
	}
	
	public void gotoPrevChannel() {	//이전 채널로 돌아가기 위한 메서드
		setChannel(prevChannel);	//변경된 채널 이전의 채널을 매개변수로 넣어준다.
	}
	
}

public class AccessModifier {
	public static void main(String args []) {
		MyTv2 t = new MyTv2();	// MyTv2 타입의 참조변수 t를 선언하고 new 명령어로 MyTv2클래스로부터 생성한 인스턴스의 주소값을 대입한다.
		
		t.setChannel(10);	//MyTv2 클래스에서 channel과 volume은 private제어자로 같은 클래스내부에서만 사용하도록 하였지만
							//getter setter 메서드를 통하여 접근이 가능하다.
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOLUME:"+t.getVolume());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();	//이 메서드로 인하여 채널의 값이 이전으로 되돌아간다.
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		
	}
}

