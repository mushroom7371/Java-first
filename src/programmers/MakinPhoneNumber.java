package programmers;

//��ȭ��ȣ ���ڸ��� ������ ��ȣ *�� ����ŷ �ϱ�
class MakinPhoneNumber {
	private String soultion(String phone_number) {
		StringBuilder maskingNum = new StringBuilder(phone_number);
		
		for(int i = 0; i < phone_number.length()-4; i++) {	//�� 4�ڸ� ������ �ݺ� �ǽ�
			maskingNum.setCharAt(i, '*');	//setCharAt()�޼��带 �̿��Ͽ� �ش� �ڸ��� ���ڰ��� *�� �ٲ۴�.
		}
		
		return maskingNum.toString();		//toString() �޼���� ��ü�� ���� ������ ������ ���ڿ��� ����� �����Ѵ�.
	}
}
