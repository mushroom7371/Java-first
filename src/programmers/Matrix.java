package programmers;

class Matrix {
	private int [][] solution(int [][] arr1, int [][] arr2) {
		int [][] answer = {};
        answer = new int [arr1.length][arr1[0].length];	//인자로 들어온 참조변수가 가리키는 1차원 배열의 크기만큼, 그 1차 배열이 가리키는 2차 배열의 크기만큼으로 크기 재설정
        
        for(int i = 0; i <arr1.length; i++) {
        	for(int j = 0; j < arr1[0].length; j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];	//정답의 해당 번지에 입력받은 배열의 숫자를 더하여 저장함
        	}
        }
        
        return answer;
    }
}
