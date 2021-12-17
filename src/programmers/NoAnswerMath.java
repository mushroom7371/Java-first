package programmers;

import java.util.ArrayList;

//������ ���ǰ��
class NoAnswerMath {
	private int [] solution(int [] answers) {
		int [] score = {0, 0, 0};	//���� ������ ������ �迭
        int [] noAnswer1 = new int [answers.length];	//������ 1,2,3 ���� ���� ��� �迭
        int [] noAnswer2 = new int [answers.length];
        int [] noAnswer3 = new int [answers.length];
        ArrayList<Integer> temp = new ArrayList();	//�ְ��� �ο��� ��� �ӽ� list
        int max = 0;	//���� ���� �ִ�
        
        for(int i = 0; i < answers.length; i++) {	//1�� �������� �� ����
        	if(i % 5 == 0) {
        		noAnswer1[i] = 1;        		
        	}else if(i % 5 == 1) {
        		noAnswer1[i] = 2;
        	}else if(i % 5 == 2) {
        		noAnswer1[i] = 3;
        	}else if(i % 5 == 3) {
        		noAnswer1[i] = 4;
        	}else if(i % 5 == 4) {
        		noAnswer1[i] = 5;
        	}
        }
        
        for(int i = 0; i < answers.length; i++) {	//2�� �������� �� ����
        	if(i % 8 == 0 || i % 8 == 2 || i % 8 == 4 || i % 8 == 6) {
        		noAnswer2[i] = 2;        		
        	}else if(i % 8 == 1) {
        		noAnswer2[i] = 1;
        	}else if(i % 8 == 3) {
        		noAnswer2[i] = 3;
        	}else if(i % 8 == 5) {
        		noAnswer2[i] = 4;
        	}else if(i % 8 == 7) {
        		noAnswer2[i] = 5;
        	}
        }
        
        for(int i = 0; i < answers.length; i++) {	//3�� �������� �� ����
        	if(i % 10 == 0 || i % 10 == 1) {
        		noAnswer3[i] = 3;        		
        	}else if(i % 10 == 2 || i % 10 == 3) {
        		noAnswer3[i] = 1;
        	}else if(i % 10 == 4 || i % 10 == 5) {
        		noAnswer3[i] = 2;
        	}else if(i % 10 == 6 || i % 10 == 7) {
        		noAnswer3[i] = 4;
        	}else if(i % 10 == 8 || i % 10 == 9) {
        		noAnswer3[i] = 5;
        	}
        }
        
        for(int i = 0; i < answers.length; i++) {	//����� ���Ͽ� �������� ���� ������ �����Ѵ�.
        	if(noAnswer1[i] == answers[i]) {
        		score[0]++;
        	}
        	if(noAnswer2[i] == answers[i]) {
        		score[1]++;
        	}
        	if(noAnswer3[i] == answers[i]) {
        		score[2]++;
        	}
        }
        
        for(int i = 0; i < 3; i++) {	//�ְ����� ã�� �ݺ�
        	if(score[i] > max) {
        		max = score[i];
        	}
        }
        
        for(int i = 0; i < 3; i++) {	//�ְ����� ���� �ο��� �ߺ� �� �� �����Ƿ� list�� �߰�
        	if(score[i] == max) {
        		temp.add(i+1);
        	}
        }
        
        int[] answer = new int[temp.size()];
        
        for(int i = 0; i < temp.size(); i++) {
        	answer[i] = temp.get(i);
        }

        return answer;
    }
}
