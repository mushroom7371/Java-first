package JavaStudy;

class MyTv2{
	
	private boolean isPowerOn;	//private �����ڷ� ���Ͽ� ���� Ŭ���������� ��밡��
	private int channel;		
	private int volume;			
	private int prevChannel;	//���� channel�� �����ϱ� ���� ���� ����
	
	final int MAX_VOLUME = 100;		//����� ���� �� �ʱ�ȭ �� ������ ���� ������ �ʴ´�.
	final int MIN_VOLUME = 0;		
	final int MAX_CHANNEL = 100;	
	final int MIN_CHANNEL = 1;		
	
	public void setChannel(int channel) {	//ŸŬ�������� private �����ڷ� ������ ������ �����ϰ� �ٲ��ֱ� ���� �޼���
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)	//�Ű������� �Ѱܹ��� ���� ��ȿ���� �����ϱ� ���� ���ǹ�
			return;	//�޼��带 void Ÿ������ �����Ͽ��⿡ return���� ����.
		
		prevChannel = this.channel;	//���� channel�� ���ư��� ���� �ٲ������ ���� channel�� ���� �����Ѵ�.
		this.channel = channel;	//���ǹ��� �������� �ʴ´ٸ� MyTv2 Ŭ������ ���� channel�� �Ű������� ���� �������� �����Ѵ�.
	}
	public int getChannel() {
		return this.channel;	//set�޼���� ������ ������ ���� �о���µ� �ʿ��� �޼��� ���������ڸ� public���� �����Ͽ��⿡ ��𼭵� ��밡���ϴ�.
	}
	
	public void setVolume(int volume) {	//���� �޼��� ��� ������ ����
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
		return;
		
		this.volume = volume;
	}
	public int getVolume() {
		return this.volume;
	}
	
	public void gotoPrevChannel() {	//���� ä�η� ���ư��� ���� �޼���
		setChannel(prevChannel);	//����� ä�� ������ ä���� �Ű������� �־��ش�.
	}
	
}

public class AccessModifier {
	public static void main(String args []) {
		MyTv2 t = new MyTv2();	// MyTv2 Ÿ���� �������� t�� �����ϰ� new ��ɾ�� MyTv2Ŭ�����κ��� ������ �ν��Ͻ��� �ּҰ��� �����Ѵ�.
		
		t.setChannel(10);	//MyTv2 Ŭ�������� channel�� volume�� private�����ڷ� ���� Ŭ�������ο����� ����ϵ��� �Ͽ�����
							//getter setter �޼��带 ���Ͽ� ������ �����ϴ�.
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOLUME:"+t.getVolume());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();	//�� �޼���� ���Ͽ� ä���� ���� �������� �ǵ��ư���.
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		
	}
}

