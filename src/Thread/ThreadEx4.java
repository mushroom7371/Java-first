package Thread;

public class ThreadEx4 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		//�̱۾����� ���� �ð��� �����ϱ����� ������ �޼��带 ������ ��Ҵ�
		
		for(int i = 0; i < 300; i++)
			System.out.printf("%s", new String("-"));
		//for �ݺ����� �̿��Ͽ� "-"�� ����ϵ��� �ϸ鼭 �ð� ������ ���� new String()���� �ݺ��� ���� ���� ��ü�� �����ǵ��� ������
		
		System.out.print("�ҿ�ð� : " + (System.currentTimeMillis() - startTime));
		//��¸޼��� ���ο��� �ֹ߼� �ð����� �޼��� - startTime �� ���Ͽ� �ð��� ����� Ȯ����
		
		for(int i = 0; i< 300; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.print("�ҿ�ð�2 : " + (System.currentTimeMillis() - startTime));
		//���� �޼��尡 ����ĥ�� ������ �� �ҿ�ð��� Ȯ��
	}

}
