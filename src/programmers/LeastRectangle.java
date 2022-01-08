package programmers;

//�ּ� ���簢��
class LeastRectangle {
	private int solution(int [][] sizes) {
		int answer = 0;
        int width = 0;
        int height = 0; 
        
        //���ΰ� ���κ��� �� ������ �����ִ� �ݺ���
        for(int i = 0; i < sizes.length; i++) {
            for(int j = 0; j < sizes[i].length / 2; j++) {
                if(sizes[i][j] < sizes[i][j + 1]) {	//ġȯ�� ���� ���� �ٲ۴�.
                    int tempNum = sizes[i][j];
                    sizes[i][j] = sizes[i][j + 1];
                    sizes[i][j + 1] = tempNum;
                }
            }
        }

        // ����, ���� �ִ��� �����ϴ� ���� width, height�� ���� �Ҵ��Ѵ�.
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

        // ���� ���θ� ���Ͽ� answer�� ����
        answer = width * height;
        return answer;
	}
}
