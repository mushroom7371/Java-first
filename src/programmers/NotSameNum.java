package programmers;

import java.util.ArrayList;

//���� ���ڴ� �Ⱦ�
class NotSameNum {
	public int [] solution(int [] arr) {
		int [] answer = {};
		ArrayList<Integer> al = new ArrayList();	//������ ���� ArrayList��ü ���� ���ʸ��� ���� Ÿ�� �������� �����.
		int num = 10;	//�ߺ��Ǵ� ���ڸ� �����ϱ� ���� ����
		
		for(int i = 0; i < arr.length; i++) {	//���� �迭�� ���̸�ŭ 1�� �����鼭 �ݺ�
			if(arr[i] != num) {	//ù ����ô� ������ ���� �Ǿ�����
				al.add(arr[i]);	//arr�迭�� i ������ �����Ͱ� �߰��ȴ�.
				num = arr[i];	//���ǹ����� �Ÿ��� ���� �ߺ��Ǵ� �����͸� num���� �����Ѵ�.
			}
		}
		
		answer = new int[al.size()];	//�迭�� ���̸� �缳��
		for(int i = 0; i < al.size(); i++) {
			answer[i] = al.get(i);	//������ �迭�� �ű��.
		}
		
		return answer;
    }
}
