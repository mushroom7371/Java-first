package certificate;

class Section041_array_dia {
	//�迭 ���̾� ������� ����� ����ϱ� (���簢�� ����� �ƴҰ��� ��� �����غ���)
	public static void main(String[] args) {
		int i, j;	//i = ù��° �迭, j = �ι�° �迭�� ��ġ�� ��� �����ϱ� ���� ����
		int [][] a = new int[5][5];	//���� ũ��5�� �迭�� ����, �������� a�� ����Ű���� ��
		//�������� a �� ù��° �迭�� ����Ű�� �� ù��° �迭�� �� �������� ũ��5�� �ι�° �迭�� ����Ŵ
		
		int k = 0;	//1�� ������ ���� ������ ��� ������
		int s = 2, e = 2;	//s = �ι��� �迭�� ���� ��ġ�� ����� ����, e = �� ��ġ�� ����� ����(��Ȯ�� ǥ���� �ƴ����� ����� ���̶� �����ϸ� ��)
		
		//�ּ��� ù������ ��츦 �����Ͽ� �ۼ���. ���Ĵ� s,e�� ���� ��ȭ�� ���� ������ �׷�����
		for (i = 0; i <= 4; i++) {	//�迭�� ���� �����ϱ� ���� �ݺ���
			for (j = s; j <= e; j++) {	//ù ���� ��(ù��° �迭�� 0������ ���) j�� 2���� ���� 2���� ���� �ǹ��ϸ� 5���� ������� �ǹ�
				k++;
				a[i][j] = k;	//a[0][2] = 1
			}	//ù ����� �ѹ��� �ݺ����� ������ �������� �ȴ�.
			if (i >= 2) {	//i�� �迭�� 2����, ������� �������� ū�� ������ �Ǵ��Ѵ�.
				s++;		//������ �����̹Ƿ� else������ ������.
				e--;
			}
			else {
				s--;		//s�� 1�����Ͽ� 1�̵ǰ�(���������� �ƴ϶� �ݺ����� ����ȴ�)
				e++;		//e�� 1�����Ͽ� 3�̵ȴ�. �� 2��° ������ ��� 1����~3�������� �����Ͱ� ����
			}
		}
		for (int x = 0; x <= 4; x++) {	//����� ���� �ݺ���
			for (int y = 0; y <= 4; y++)
				System.out.printf("%3d", a[x][y]);
			System.out.printf("\n");
		}
	}

}