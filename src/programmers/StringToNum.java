package programmers;

class StringToNum {
	private int solution(String s) {
		int answer = 0;
		String [] str = new String [] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		//�ٲ� ���ڵ��� String �迭�� ��Ƶд�. ��� �� ���δ� String Ÿ���� �������� str�� String �迭�� �ּҸ� ����Ű�� �� �迭�� ������ ������ String�� ����Ų��.
		
		for(int i = 0; i < str.length; i++) {	//str�� ���̸�ŭ 1�� �����ϸ鼭 �ݺ��Ѵ�.
			s = s.replaceAll(str[i], String.valueOf(i));	//s�� ����Ű�� ���ڿ� �� str[i]������ �ش��ϴ� ���ڸ� i�� ��ü�Ѵ�.
		}
		
		answer = Integer.parseInt(s);	//s�� Strgin Ÿ���̹Ƿ� int Ÿ������ ��ȯ ���� �ش�.
		
		return answer;
	 }
}
