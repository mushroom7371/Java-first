package programmers;

import java.util.ArrayList;
import java.util.Collections;

//�ּڰ� �����
class MakeMinNum {
	private int solution(int [] A, int [] B){
		int answer = 0;
		ArrayList<Integer> ala = new ArrayList();	//������ ���� �����͸� ������ ArrayList ��ü ����
		ArrayList<Integer> alb = new ArrayList();
		
		for(int i = 0; i < A.length; i++) {	//ArrayList ��ü�� ���ڰ����� �־��� ���������� ����Ű�� �迭�� �����͸� �߰��Ͽ� �ش�.
			ala.add(A[i]);
		}
		
		for(int i = 0; i < B.length; i++) {
			alb.add(B[i]);
		}
		
		//�� ������ �����͸� ���Ͽ� ���� ����� �ּڰ��� �Ǳ� ���ؼ��� ����ū ���� ���� �������� ���ϰ�, �ι�°�� ū���� �ι�°�� �������� ���Ͽ��� �ȴ�.
		//�̸� ���� ���� �۾�
		Collections.sort(ala);
		Collections.sort(alb, Collections.reverseOrder());
		
		for(int i = 0; i < ala.size(); i++) {	//ū���� �������� ���Ͽ� answer�� ���Ͽ� �ش�.
			answer += ala.get(i) * alb.get(i);
		}

		return answer;
    }
}
