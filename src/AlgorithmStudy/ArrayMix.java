package AlgorithmStudy;

public class ArrayMix {

	public static void main(String[] args) {
		int [] arr = new int[45];	//���̰� 45�� intŸ���� ���� �����ϴ� �迭�� �����ϰ� �������� arr�� �ּҰ��� ��´�.
		
		for(int i = 0; i < arr.length; i++) {	//arr �迭�� ���̸�ŭ �ݺ��Ѵ�.
			arr[i] = i + 1;	//arr�� ����Ű�� �迭�� ù��° ������ ���� 1���� 1�� �����Ͽ� �����Ѵ�.
		
		}
		
		int temp = 0;	// ������ �ٲٱ����� �ӽ� ���� ����
		int j = 0;	//������ ���� �����ϱ� ���� ����
		
		for(int i = 0; i < 6; i++) {	//0~5���� �ݺ�
			j = (int)(Math.random()*45) +1; //�ݺ��� ���۵ɶ����� int Ÿ���� ���� j�� ���� 1~45������ ���� ���Ƿ� �����Ѵ�.
			
			temp = arr[i];	//�⺻���� temp�� arr[i]������ ���� �����Ѵ�.
			arr[i] = arr[j];	//arr[i]�� ���� ������ ���� j�� �������� ������ arr[j]�� ���� �����Ѵ�. arr[j]�� j�� ���� ������.
			arr[j] = temp;	//arr[j] �� ���� temp�� �����Ͽ� ��ȯ�Ѵ�.
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}

	}

}
