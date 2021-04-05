package ch07;

public class CaptionTvTest {
	public static void main(String [] args) {
		CaptionTv ctv = new CaptionTv();	//TvŬ������ ��ӹ��� Caption Ŭ�������� ��ü�� �����Ͽ���.
		ctv.channel = 10;	// ���� Ŭ������ ����� int Ÿ���� �޸𸮰��� channel�� 10�� ����.
		ctv.channelup();	// ���� Ŭ������ �޼��带 ȣ���Ͽ� channel���� 1 ���� ��Ŵ
		System.out.println(ctv.channel);
		ctv.displyCaption("Hellow, World");	// �ڼ� Ŭ������ �޼��带 ȣ�� �Ͽ����� caption�� �ʱⰪ�� false�̹Ƿ� ��µ��� ����
		ctv.caption = true;
		ctv.displyCaption("Hellow, World");	
	}
}

	class Tv{
		boolean power;	//�ν��Ͻ� ����,  boolean Ÿ���� power�� ����
		int channel;	//�ν��Ͻ� ����, int Ÿ���� channel�� ����
		
		void power() { power = !power; }	//�ν��Ͻ� �޼��� 
		void channelup() { ++channel; }
		void channeldown() { --channel; }
	}
	
	class CaptionTv extends Tv{	//Tv Ŭ������ ��� �޴� CaptionTv Ŭ���� �ȿ� Tv Ŭ������ �ν��Ͻ� ������ �ν��Ͻ� �޼������ ����ִ�
		boolean caption;
		void displyCaption(String text) {
			if(caption) {
				System.out.println(text);
			}
		}
	}
