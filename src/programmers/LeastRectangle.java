package programmers;

//최소 직사각형
class LeastRectangle {
	private int solution(int [][] sizes) {
		int answer = 0;
        int width = 0;
        int height = 0; 
        
        //세로가 가로보다 긴 명함을 눕혀주는 반복문
        for(int i = 0; i < sizes.length; i++) {
            for(int j = 0; j < sizes[i].length / 2; j++) {
                if(sizes[i][j] < sizes[i][j + 1]) {	//치환을 통해 값을 바꾼다.
                    int tempNum = sizes[i][j];
                    sizes[i][j] = sizes[i][j + 1];
                    sizes[i][j + 1] = tempNum;
                }
            }
        }

        // 가로, 세로 최댓값을 만족하는 값을 width, height에 각각 할당한다.
        for(int i = 0; i < sizes.length; i++) {
            for(int j = 0; j < sizes[i].length / 2; j++) {
                if(sizes[i][j] > width) {
                	width = sizes[i][j];
                }

                if(sizes[i][j + 1] >height) {
                	height = sizes[i][j + 1];
                }
            }
        }

        // 가로 세로를 곱하여 answer에 저장
        answer = width * height;
        return answer;
	}
}
