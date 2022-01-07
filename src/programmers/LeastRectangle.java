package programmers;

class LeastRectangle {
	private int solution(int [][] sizes) {
		int answer = 0;
        int width = 0;
        int height = 0; 
        
        for(int i = 0; i < sizes.length; i++) {
        	if(width <= sizes[i][0]) {
        		width = sizes[i][0];
        	}
        	
        	for(int j = 0; j < sizes[0].length; j++) {
        		if(height <= sizes[i][j]) {
        			height = sizes[i][j];
        		}
        	}
        	
        }
        
        return answer;
	}
}
