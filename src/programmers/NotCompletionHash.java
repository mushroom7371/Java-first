package programmers;

import java.util.HashMap;
import java.util.Map.Entry;

class NotCompletionHash {
	private String solution(String [] participant, String [] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//������, �������� ������ ���� HashMap�� �����Ͽ� �ش�
		
		//������ �迭�� ��� ���� �ؽ� �ʿ� �־��ش�.
		for(String part : participant) {
			//key = ���ڿ�, value = ���� �ʿ� ����� ���ڿ��� ���� +1
			map.put(part, map.getOrDefault(part, 0) + 1);
			//getOrDefalut()�� map���� ã�� key�� ���ٸ� defaultValue�� ����
		}
		
		//������ �迭�� ��� ���� �ؽ� �ʿ� �־��ش�.
		for(String comp : completion) {
			//���� ���ڿ��� ã�� value�� ���� -1
			map.put(comp, map.get(comp) -1);
		}
		
//		for (Entry<String, Integer> entry : map.entrySet()) {
//			if (entry.getValue() > 0) {
//				answer = entry.getKey();
//				break;
//			}
//		}
		
		for (String key : map.keySet()) {	//�ݺ����� ���Ͽ� map�� ��� key ���� ��ȯ�Ѵ�.
			if (map.get(key) != 0) {	//�ش� key�� value ���� 0�� �ƴϸ� �������� ���� �ο��̴�.
				answer = key;
			}
		}
		
		return answer;
	}
}
