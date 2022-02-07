package programmers;

class TriangleSnail {
	static int [] solution(int n) {
		int [] answer = {};
		int [][] array2d = new int [n][n];
		int x = -1;
		int y = 0;
		int num = 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				if(i % 3 == 0) {
					x++;
				}else if(i % 3 == 1) {
					y++;
				}else if(i % 3 == 2) {
					x--;
					y--;
				}
				array2d[x][y] = num++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int n = 5;
		
		solution(n);
	}
}
