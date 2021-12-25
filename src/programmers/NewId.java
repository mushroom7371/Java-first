package programmers;

//�űԾ��̵� ��õ
class NewId {
	private String solution(String new_id) {
		String answer = "";
		
		//1�ܰ� �ҹ��ڷ� ġȯ
		String step1 = new_id.toLowerCase();
		
		//2�ܰ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� ����
		char[] step1_arr = step1.toCharArray();	//������ �ڵ鸵 �ϱ� ���� char �迭�� ��´�.
        StringBuilder step2 = new StringBuilder();	//�ݺ��� ���� �Ÿ� ���ڸ� ������ StringBuilder ��ü ����
        
        for (char c : step1_arr) {	//step1_arr�� ��� ���ڵ��� �Ʒ��� ���ǿ� �����Ѵٸ�
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                step2.append(c);	//�� ���ڿ��� ���Ѵ�.
            }
        }
        
        //3�ܰ� ..�� ���ӵ� ��� .���� ġȯ�Ѵ�.
        String step3 = step2.toString().replace("..", ".");
        
        while (step3.contains("..")) {	//..�� �ִٸ�
            step3 = step3.replace("..", ".");	//.���� ġȯ�Ѵ� ��ħǥ�� �������� �پ� �ִ��� while���� ���Ͽ� �ᱹ �Ѱ��� ���Ե�
        }
        
        //4�ܰ� .�� ó���̳� ���� �ִٸ� ����
        String step4 = step3;
        
        if (step4.length() > 0) {	//���ڿ��� 0���� ũ�ٸ�
            if (step4.charAt(0) == '.') {	//ù��° ������ ��ħǥ�� ������ �����Ѵ�.
                step4 = step4.substring(1, step4.length());
            }
        }
        
        if (step4.length() > 0) {
            if (step4.charAt(step4.length() - 1) == '.') {	//���ڸ��� �ִٸ� �����Ѵ�.
                step4 = step4.substring(0, step4.length() - 1);
            }
        }
        
        //5�ܰ� ���ڿ��̶�� a�� �����Ѵ�.
        String step5 = step4;
        
        if (step5.equals("")) {
            step5 = "a";
        }
        
        //6�ܰ� 16�� �̻��̶��, ù 15���� ���ڸ� ������ �������� �ڸ���.
        String step6 = step5;
        
        if (step6.length() >= 16) {
            step6 = step6.substring(0, 15);

            if (step6.charAt(step6.length() - 1) == '.') {	//�ڸ� ���ڸ��� .���� ������
                step6 = step6.substring(0, step6.length() - 1);	//.�� �����Ѵ�.
            }
        }
        
        //7�ܰ� 2�ڸ� ���϶�� ������ ���ڸ� 3�ڸ��� �ɶ����� ���ڸ��� ����
        StringBuilder step7 = new StringBuilder(step6);
        
        if (step7.length() <= 2) {
            char last = step7.charAt(step7.length() - 1);

            while (step7.length() < 3) {
                step7.append(last);
            }
        }

        answer = String.valueOf(step7);

		return answer;
	}
}
