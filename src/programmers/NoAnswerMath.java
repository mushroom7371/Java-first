package programmers;

import java.util.ArrayList;

//수포자 모의고사
class NoAnswerMath {
	private int [] solution(int [] answers) {
		int [] score = {0, 0, 0};	//맞춘 갯수를 저장할 배열
        int [] noAnswer1 = new int [answers.length];	//수포자 1,2,3 들의 답이 담길 배열
        int [] noAnswer2 = new int [answers.length];
        int [] noAnswer3 = new int [answers.length];
        ArrayList<Integer> temp = new ArrayList();	//최고점 인원이 담길 임시 list
        int max = 0;	//정답 갯수 최대
        
        for(int i = 0; i < answers.length; i++) {	//1번 수포자의 답 패턴
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
        
        for(int i = 0; i < answers.length; i++) {	//2번 수포자의 답 패턴
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
        
        for(int i = 0; i < answers.length; i++) {	//3번 수포자의 답 패턴
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
        
        for(int i = 0; i < answers.length; i++) {	//정답과 비교하여 수포자의 맞춘 갯수를 저장한다.
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
        
        for(int i = 0; i < 3; i++) {	//최고점을 찾는 반복
        	if(score[i] > max) {
        		max = score[i];
        	}
        }
        
        for(int i = 0; i < 3; i++) {	//최고점을 받은 인원이 중복 될 수 있으므로 list에 추가
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
