package certificate;

class Section014_facto {
	//����Լ��� �ƴ� ���丮�� 1! +...+ 10! ������ ��
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		int sum = 1;	//1���� �ǳʶٹǷ� 1�� ����
		
		do {
			i++;
			j *= i;
			sum += j;
		}while(i < 10);
	
		System.out.println(sum);
	}

}
