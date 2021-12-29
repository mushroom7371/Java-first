package programmers;

import java.util.ArrayList;
import java.util.Collections;

class BiggestNum {
	private String solution(int[] numbers) {
		String answer = "";
		ArrayList<String> strNum = new ArrayList();	//int ���� String ������ ������ ArrayList ��ü ����
		
		for(int i = 0; i < numbers.length; i++) {	//�־��� �迭�� �����͸� ��ȯ�Ͽ� strNum�� ����Ű�� ArrayList ��ü�� ���Ѵ�.
			strNum.add(String.valueOf(numbers[i]));
		}
		
		Collections.sort(strNum, (a, b) -> (b + a).compareTo(a + b));	//���ٽ��� ����Ͽ� ������ �������� ����
		
		if(strNum.get(0).startsWith("0")) {	//�־��� �迭�� [0,0] ������ �־����� "0"���� ��ȯ
			return "0";			
		}
		
		for(int i = 0; i < strNum.size(); i++) {	//answer�� ���ĵ� ������ �����ϰ�
			answer += strNum.get(i);
		}
		
		return answer;
    }
}
