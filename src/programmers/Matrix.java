package programmers;

class Matrix {
	private int [][] solution(int [][] arr1, int [][] arr2) {
		int [][] answer = {};
        answer = new int [arr1.length][arr1[0].length];	//���ڷ� ���� ���������� ����Ű�� 1���� �迭�� ũ�⸸ŭ, �� 1�� �迭�� ����Ű�� 2�� �迭�� ũ�⸸ŭ���� ũ�� �缳��
        
        for(int i = 0; i <arr1.length; i++) {
        	for(int j = 0; j < arr1[0].length; j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];	//������ �ش� ������ �Է¹��� �迭�� ���ڸ� ���Ͽ� ������
        	}
        }
        
        return answer;
    }
}
