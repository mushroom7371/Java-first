package ch07;

class TVCR extends Tv1 {	//���߻���� �Ұ����ϱ⿡ ���� ��� �� ���԰��踦 �ξ���.
	VCR vcr = new VCR();	//Ŭ���� ���ο��� ��ü�� �����ϱ� ������ ���԰���� �����Ƿ� ���߻���� ������ ������.
	
	void play() {	//�޼����� ������ vcr�� ����Ű�� ��ü�� �޼��带 ȣ���Ѵ�.
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
}

class Tv1{	//��ӹ��� Ŭ�������� ����� �θ� Ŭ����
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class VCR{	//���� ����� �̿��ϰ� ������ �ڹٿ����� ���ϻ���� ��Ģ���� �Ѵ�.
	boolean power;
	int counter = 0;
	
	void power(){power = !power;}
	//�޼��� ���� ����
	void play() {}
	void stop()	{}
	void rew() {}
	void ff() {}
}
