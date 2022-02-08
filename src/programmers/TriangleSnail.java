package programmers;

//삼각 달팽이
class TriangleSnail {
	private int [] solution(int n) {
		int[] answer = new int[(n*(n+1))/2];	//높이가 n인 삼각형의 데이터 갯수 등차수열의 합 공식을 이용
		int [][] array2d = new int [n][n];		//n*n 으로 이차원 배열 선언
		int x = -1;
		int y = 0;
		int num = 1;
		
		//이중 for문으로 이차원 배열 순회
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {	//반복 될때 마다 숫자가 감소하므로 i부터 시작
				if(i % 3 == 0) {	//아래로 이동
					x++;
				}else if(i % 3 == 1) {	//오른쪽으로 이동
					y++;
				}else if(i % 3 == 2) {	//대각선으로 이동
					x--;
					y--;
				}
				array2d[x][y] = num++;	//해당 위치의 데이터값을 1증가
			}
		}
		
		int k = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(array2d[i][j] == 0) {
					break;					
				}
					answer[k++] = array2d[i][j];
				}
		}

		return answer;
	}
}
