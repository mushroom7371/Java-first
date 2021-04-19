package AlgorithmStudy;

public class MaxMinMethod {
	public static void main(String [] args) {
		MaxMinMethod mmm = new MaxMinMethod();
		//MaxMinMetho Ŭ������ public �����ڷ� ������ max4() �޼��带 ����ϱ� ���Ͽ� ��ü�� �����Ѵ�.
		
		int max = mmm.max4(632, 28956, 34, 185);
		//���� max4() ��ü�� �������� �ʰ� ����Ѵٸ� �� �޼���� ����� �Ұ��� �ϴ�.
		int min = min3(28956, 34, 185);
		//min3() �޼���� static �����ڷ� �����Ͽ��⿡ Ŭ������ �޸𸮿� �ö󰥶� �����ȴ�.
		//�׷��Ƿ� ���� ��ü�� �������� �ʾƵ� ��밡���ϴ�. ���� public���� ������ �޼���� �ٸ���.
		
		System.out.println(max);
		System.out.println(min);
		
	}

	public int max4(int a, int b, int c, int d) {
		//�޼����� �Ű������� �Է¹��� ���� �ִ밪�� ���ϴ� �޼��� ���ϰ��� int�� ������.
		int max = a;	//max���� ���ϱ� ���� ������ ������ �ʱⰪ�� �Ű������� ���� �� �� �ϳ��� ������ �Ѵ�.
		
		if(max < b) { max = b;}	//max�� b �� b�� �� ũ�ٸ�, b�� �ִ밪�� �ɰ��̱⿡ max�� ���� �ִ밪���� �����Ѵ�. �ƴ϶�� �ƹ������� ���� �ʴ´�.
		if(max < c) { max = c;}
		if(max < d)	{ max = d;}		
		
		return max;
		//���� ���ǹ��� ��ġ�� ������ ���� �ִ밪�� �Ǿ� �̸� ��ȯ�Ѵ�.
	}
	
	static int min3(int a, int b, int c) {	//static���� ������ �޼��� ��ü ������ �ʿ����.
		int min = a;	//max4�޼���� �ݴ�� �ּҰ��� Ȯ���ϱ� ���� �޼���
		
		if(min > b) { min = b;}
		if(min > c) { min = c;}
		
		return min;
	}
}
